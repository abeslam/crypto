package org.jcryptool.visual.he.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.jcryptool.visual.he.Messages;
import org.jcryptool.visual.he.algo.GHData;

/**
 * Wizard to enter an operation number for Gentry & Halevi fully homomorphic visualization
 * @author Coen Ramaekers
 *
 */
public class GHOperationTextWizard extends Wizard {
	/** wizard title, displayed in the titlebar. */
	private static final String TITLE = Messages.OperationTextWizard_Title;
	
	/** 2-log of modulus */
	private int logMod;
	
	/** Will hold data */
	private GHData data;
	
	public GHOperationTextWizard(int logMod, GHData data) {
		this.logMod = logMod;
		this.data = data;
		this.setWindowTitle(TITLE);
	}
	
	@Override
	public void addPages() {
		addPage(new GHChooseOperationTextPage(logMod, data));
	}
	
	@Override
	public boolean canFinish() {
		return getPage(GHChooseOperationTextPage.getPagename()).isPageComplete();
	}
	
	@Override
	public boolean performFinish() {
		return true;
	}
}