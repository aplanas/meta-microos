SUMMARY = "Qt 6 Tools libraries and tools"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application \
development. \
 \
Included are Qt Designer (GUI design), QDbusViewer and more."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "31f6d8d9a84b1d58a20c69a0975e71e8c2850d34114689bd7e73dff96cd2af102d085e51ed2e618b15ebaeb8e34d7e6a1b78cc825f75c8919ac5e50cfed0f0c3"

RPROVIDES:${PN} += "qt6-tools qt6-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) qt6-tools-helpgenerators qt6-tools-qdoc"

inherit rpm
