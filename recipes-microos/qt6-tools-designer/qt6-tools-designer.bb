SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-designer-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f95e99679c775bc66c8014b6d969db08eb447a29cdb134e981868815cc88442acd5f2f0b73b0dc72e277a377a80c85a60af5fd775da103ce436f2fd3f193ff90"

RPROVIDES:${PN} += "application() application(org.qt.designer6.desktop) libcontainerextension.so()(64bit) libcustomwidgetplugin.so()(64bit) libqquickwidget.so()(64bit) libqquickwidget.so(Qt_6)(64bit) libqquickwidget.so(Qt_6.0)(64bit) libqquickwidget.so(Qt_6.1)(64bit) libqquickwidget.so(Qt_6.2)(64bit) libqquickwidget.so(Qt_6.3)(64bit) libqquickwidget.so(Qt_6.4)(64bit) libqquickwidget.so(Qt_6.5)(64bit) libqquickwidget.so(Qt_6.5.0_PRIVATE_API)(64bit) libtaskmenuextension.so()(64bit) mimehandler(application/x-designer) qt6-tools-designer qt6-tools-designer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Designer.so.6()(64bit) libQt6Designer.so.6(Qt_6)(64bit) libQt6DesignerComponents.so.6()(64bit) libQt6DesignerComponents.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6PrintSupport.so.6()(64bit) libQt6PrintSupport.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6QuickWidgets.so.6()(64bit) libQt6QuickWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
