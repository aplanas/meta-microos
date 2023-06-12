SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-designer-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9c7d88cc2003e524c3ee7db27b4aac6cf4cda9f99be1ed7af945f705d2cb020161c8e4d96b246717814e2151d17c6ae505d118a2fd37570b3527b036ead25ae6"

RPROVIDES:${PN} += "application() \
application(org.qt.designer6.desktop) \
libcontainerextension.so()(64bit) \
libcustomwidgetplugin.so()(64bit) \
libqquickwidget.so()(64bit) \
libqquickwidget.so(Qt_6)(64bit) \
libqquickwidget.so(Qt_6.0)(64bit) \
libqquickwidget.so(Qt_6.1)(64bit) \
libqquickwidget.so(Qt_6.2)(64bit) \
libqquickwidget.so(Qt_6.3)(64bit) \
libqquickwidget.so(Qt_6.4)(64bit) \
libqquickwidget.so(Qt_6.5)(64bit) \
libqquickwidget.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libtaskmenuextension.so()(64bit) \
mimehandler(application/x-designer) \
qt6-tools-designer \
qt6-tools-designer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Designer.so.6()(64bit) \
libQt6Designer.so.6(Qt_6)(64bit) \
libQt6DesignerComponents.so.6()(64bit) \
libQt6DesignerComponents.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickWidgets.so.6()(64bit) \
libQt6QuickWidgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
