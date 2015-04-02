/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.text.completion;

import melnorme.lang.ide.ui.ContentAssistConstants;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

/**
 * Only {@link ContentAssistConstants} should refer to this class, no one else, 
 * not even the initializer class!
 */
public interface ContentAssistConstants_Default {
	
	String AUTOACTIVATION = "content_assist_autoactivation";
	String AUTOACTIVATION_DELAY = "content_assist_autoactivation_delay";
	String PROPOSALS_FOREGROUND = "content_assist_proposals_foreground";
	String PROPOSALS_BACKGROUND = "content_assist_proposals_background";
	String PARAMETERS_FOREGROUND = "content_assist_parameters_foreground";
	String PARAMETERS_BACKGROUND = "content_assist_parameters_background";
	
	String AUTOINSERT = "content_assist_autoinsert";
	
	String PREFIX_COMPLETION = "content_assist_prefix_completion";
	
	String AUTOACTIVATION_TRIGGERS = "content_assist_autoactivation_triggers_script";
	
	public class _PrefInitializer 
		implements ContentAssistConstants // We need to import this constant, to use the overridable namespace 
	{
		
		public static void initializeDefaults(final IPreferenceStore store) {
			store.setDefault(AUTOACTIVATION, true);
			store.setDefault(AUTOACTIVATION_DELAY, 200);
			
			store.setDefault(PROPOSALS_BACKGROUND, StringConverter.asString(new RGB(255, 255, 255)));
			store.setDefault(PROPOSALS_FOREGROUND, StringConverter.asString(new RGB(0, 0, 0)));
			store.setDefault(PARAMETERS_BACKGROUND, StringConverter.asString(new RGB(255, 255, 255)));
			store.setDefault(PARAMETERS_FOREGROUND, StringConverter.asString(new RGB(0, 0, 0)));
			
			store.setDefault(AUTOINSERT, true);
//			store.setDefault(TIMEOUT, 5000);
			store.setDefault(PREFIX_COMPLETION, false);
			
			store.setDefault(AUTOACTIVATION_TRIGGERS, ".");
		}
		
	}
	
}