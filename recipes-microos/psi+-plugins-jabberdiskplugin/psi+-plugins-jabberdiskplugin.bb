SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds support for remote jabber disks into Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-jabberdiskplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "d5d27981a606f33eba331cb7874214c8e3dbb58b60b77ae8c7a3607b61a501ae2169d1d145e42669d89762622beae4b6934878c6bd39a0b1c3f12a0bde31f254"

RPROVIDES:${PN} += "libjabberdiskplugin.so()(64bit) psi+-plugins-jabberdiskplugin psi+-plugins-jabberdiskplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
