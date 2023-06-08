SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kxmlgui-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "f745302836f01241fd71449408c4241ed6c928dfbf34c8462d9ef59178aba7bfc4bd868bd0bf25a47f631a32e150b4e9d37b18cea6cef434ace73b8d65e2fc76"

RPROVIDES:${PN} += "cmake(KF5XmlGui) kxmlgui-devel kxmlgui-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5ConfigWidgets) cmake(Qt5DBus) cmake(Qt5Widgets) cmake(Qt5Xml) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5XmlGui.so.5()(64bit) libKF5XmlGui5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
