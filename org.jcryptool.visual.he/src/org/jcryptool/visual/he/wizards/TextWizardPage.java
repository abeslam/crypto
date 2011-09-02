package org.jcryptool.visual.he.wizards;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Text;
import org.jcryptool.visual.library.Lib;

/**
 * abstract superclass for all wizardpages that want only text-input.
 * 
 * @author Michael Gaber
 */
public abstract class TextWizardPage extends WizardPage {

	/**
	 * Constructor does only call super.
	 * 
	 * @see WizardPage
	 * @param pageName
	 *            name of the Page
	 * @param title
	 *            title to be shown
	 * @param titleImage
	 *            the ImageDescriptor of the image to be shown
	 */
	protected TextWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	/** textfield. */
	protected Text text;

	/** constants for some charactergroups to verify the input in the wizards. */
	public static final String WHITESPACE = Lib.WHITESPACE,
			HEXDIGIT = Lib.HEXDIGIT, CHARACTERS = Lib.CHARACTERS,
			DIGIT = Lib.DIGIT;

	/**
	 * getter for the text that was entered in this wizardpage.
	 * 
	 * @return content of the text-field
	 */
	public String getText() {
		return text.getText();
	}

}
