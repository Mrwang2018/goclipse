/*******************************************************************************
 * Copyright (c) 2015, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.core.operations.build;

import java.text.MessageFormat;

import melnorme.lang.tooling.bundle.BuildConfigMessages;

public interface BuildManagerMessages extends BuildConfigMessages {
	
	public String ERROR_ProjectBuildSettingsOutOfDate = 
			"Could not change build target settings, the build target to be changed is out of date.";
	
	public String MSG_BuildingProject = "Building {0} project: {1}";
	public String MSG_ClearingMarkers = "Cleared problem markers for {0}.";
	public String MSG_BuildTerminated = "Build terminated.";
	public String MSG_NoBuildTargetsEnabled = "No build targets enabled.";
	
	public String LABEL_EnableForNormalBuild = "Enable for workspace build";
	public String LABEL_EnableForAutoBuild = "Enable for auto-check (invoke on editor save)";
	
	public String NAME_BuildEnabledTargetsAction = "Build Enabled";
	public String NAME_BuildAllTargetsAction = "Build All";
	public String NAME_RunBuildTargetAction = "Build target";
	
	public String NAME_ConfigureTargetsAction = "Configure targets...";
	public String NAME_ConfigureTargetAction = "Configure target...";
	public String NAME_RunTargetAction = "Run target";
	public String NAME_DebugTargetAction = "Debug target";
	
	public String INFO_BuildTargetAction = "Building target `{1}` of project {0}";
	
	public String MSG_Starting_LANG_Build = "Starting {0} build";
	
	public String NO_BUILD_TARGET_FOUND_FOR_BUILD_TYPE_0 = "No Build Target found for build type `{0}`. ";
	
	public static String BuildType_NotFound(String buildTypeString) {
		return MessageFormat.format("No such build type: `{0}`.", buildTypeString);
	}
	
}