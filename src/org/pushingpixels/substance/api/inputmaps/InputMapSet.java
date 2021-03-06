/*
 * Copyright (c) 2005-2010 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.substance.api.inputmaps;

public interface InputMapSet {
	public SubstanceInputMap getButtonFocusInputMap();

	public SubstanceInputMap getCheckBoxFocusInputMap();

	public SubstanceInputMap getComboBoxAncestorInputMap();

	public SubstanceInputMap getDesktopAncestorInputMap();

	public SubstanceInputMap getEditorPaneFocusInputMap();

	public SubstanceInputMap getFileChooserAncestorInputMap();

	public SubstanceInputMap getFormattedTextFieldFocusInputMap();

	public SubstanceInputMap getListFocusInputMap();

	public SubstanceInputMap getPasswordFieldFocusInputMap();

	public SubstanceInputMap getRadioButtonFocusInputMap();

	public SubstanceInputMap getRootPaneAncestorInputMap();

	public SubstanceInputMap getScrollBarAncestorInputMap();

	public SubstanceInputMap getScrollPaneAncestorInputMap();

	public SubstanceInputMap getSliderFocusInputMap();

	public SubstanceInputMap getSpinnerAncestorInputMap();

	public SubstanceInputMap getSplitPaneAncestorInputMap();

	public SubstanceInputMap getTabbedPaneAncestorInputMap();

	public SubstanceInputMap getTabbedPaneFocusInputMap();

	public SubstanceInputMap getTableAncestorInputMap();

	public SubstanceInputMap getTableHeaderAncestorInputMap();

	public SubstanceInputMap getTextAreaFocusInputMap();

	public SubstanceInputMap getTextFieldFocusInputMap();

	public SubstanceInputMap getTextPaneFocusInputMap();

	public SubstanceInputMap getToggleButtonFocusInputMap();

	public SubstanceInputMap getToolBarAncestorInputMap();

	public SubstanceInputMap getTreeAncestorInputMap();

	public SubstanceInputMap getTreeFocusInputMap();
}