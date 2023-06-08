SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to make it easy to download and install iconsets and \
other resources for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-contentdownloaderplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "dc965e555eac2646459d4c760e2b9b56ffdff9fe891108295fea4c8ee858b9921fcc7de2b5792525aa9f02a51df9dbad039e447d692d3b628bf42651d8264262"

RPROVIDES:${PN} += "libcontentdownloaderplugin.so()(64bit) psi+-plugins-contentdownloaderplugin psi+-plugins-contentdownloaderplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
