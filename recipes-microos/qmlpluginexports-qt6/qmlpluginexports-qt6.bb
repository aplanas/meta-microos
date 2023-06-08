SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt6-1.0-1.12.aarch64.rpm"
RPM_HASH = "4844274e87ed01ab548367a3e7709327c200bc16f5d81161833086379acde16c43e1ab5520a80ab9e0c18284f7308836240d8055284200a1af89ab70cdb1514e"

RPROVIDES:${PN} += "qmlpluginexports-qt6 qmlpluginexports-qt6(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
