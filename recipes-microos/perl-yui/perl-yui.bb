SUMMARY = "Perl bindings for libyui"
DESCRIPTION = "This package provides Perl language bindings to access functions of \
yast2-libyui - An User Interface engine that provides the \
abstraction from graphical user interfaces (Qt, Gtk) and text based \
user interfaces (ncurses). \
 \
Authors: \
--------- \
-    kkaempf@suse.de \
-    dmacvicar@suse.de"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "perl-yui-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "ebb41b110e20be619c69d60b0f435925c4034d05574b73c726a4225e50480207dc0ae9dc627f4b07bba37be009bf3a045e53b75d7825acf07531ab9a25757c17"

RPROVIDES:${PN} += "perl(yui) perl(yui::YAlignment) perl(yui::YApplication) perl(yui::YBarGraph) perl(yui::YBarGraphMultiUpdate) perl(yui::YBarGraphSegment) perl(yui::YBuiltinCaller) perl(yui::YBusyIndicator) perl(yui::YCancelEvent) perl(yui::YCheckBox) perl(yui::YCheckBoxFrame) perl(yui::YCodeLocation) perl(yui::YColor) perl(yui::YComboBox) perl(yui::YCommandLine) perl(yui::YDateField) perl(yui::YDebugEvent) perl(yui::YDialog) perl(yui::YDownloadProgress) perl(yui::YDumbTab) perl(yui::YEmpty) perl(yui::YEvent) perl(yui::YExternalWidgetFactory) perl(yui::YExternalWidgets) perl(yui::YFrame) perl(yui::YImage) perl(yui::YInputField) perl(yui::YIntField) perl(yui::YItem) perl(yui::YItemCollection) perl(yui::YItemSelector) perl(yui::YItemShortcut) perl(yui::YKeyEvent) perl(yui::YLabel) perl(yui::YLayoutBox) perl(yui::YLogView) perl(yui::YMacro) perl(yui::YMacroPlayer) perl(yui::YMacroRecorder) perl(yui::YMenuBar) perl(yui::YMenuButton) perl(yui::YMenuEvent) perl(yui::YMenuItem) perl(yui::YMenuWidget) perl(yui::YMultiLineEdit) perl(yui::YMultiProgressMeter) perl(yui::YMultiSelectionBox) perl(yui::YOptionalWidgetFactory) perl(yui::YPackageSelector) perl(yui::YPackageSelectorPlugin) perl(yui::YPartitionSplitter) perl(yui::YProgressBar) perl(yui::YProperty) perl(yui::YPropertySet) perl(yui::YPropertyValue) perl(yui::YPushButton) perl(yui::YRadioButton) perl(yui::YRadioButtonGroup) perl(yui::YReplacePoint) perl(yui::YRichText) perl(yui::YSelectionBox) perl(yui::YSelectionWidget) perl(yui::YSettings) perl(yui::YShortcut) perl(yui::YShortcutManager) perl(yui::YSimpleEventHandler) perl(yui::YSimpleInputField) perl(yui::YSingleChildContainerWidget) perl(yui::YSlider) perl(yui::YSpacing) perl(yui::YSpecialKeyEvent) perl(yui::YSquash) perl(yui::YStringTree) perl(yui::YStringWidgetID) perl(yui::YTable) perl(yui::YTableCell) perl(yui::YTableHeader) perl(yui::YTableItem) perl(yui::YTimeField) perl(yui::YTimeoutEvent) perl(yui::YTimezoneSelector) perl(yui::YTransText) perl(yui::YTree) perl(yui::YTreeItem) perl(yui::YUI) perl(yui::YUIBadPropertyArgException) perl(yui::YUIButtonRoleMismatchException) perl(yui::YUICantLoadAnyUIException) perl(yui::YUIDialogStackingOrderException) perl(yui::YUIException) perl(yui::YUIIndexOutOfRangeException) perl(yui::YUIInvalidDimensionException) perl(yui::YUIInvalidWidgetException) perl(yui::YUILoader) perl(yui::YUILog) perl(yui::YUINoDialogException) perl(yui::YUINullPointerException) perl(yui::YUIOutOfMemoryException) perl(yui::YUIPlugin) perl(yui::YUIPluginException) perl(yui::YUIPropertyException) perl(yui::YUIPropertyTypeMismatchException) perl(yui::YUISetReadOnlyPropertyException) perl(yui::YUISyntaxErrorException) perl(yui::YUIUnknownPropertyException) perl(yui::YUIUnsupportedWidgetException) perl(yui::YUIWidgetNotFoundException) perl(yui::YWidget) perl(yui::YWidgetEvent) perl(yui::YWidgetFactory) perl(yui::YWidgetID) perl(yui::YWizard) perl(yuic) perl-yui perl-yui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libperl.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui.so.16()(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
