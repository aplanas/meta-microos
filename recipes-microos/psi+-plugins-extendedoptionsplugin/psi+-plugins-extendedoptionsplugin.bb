SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to allow easy configuration of some advanced options in \
Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-extendedoptionsplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "021227e870dc1b35fa02612f0cd1f99e08289feb3af4042e0248a949375be4d12ac64038eee887978f1f5ca0e5fd3f92d66253a450bf358aeb309ea46d850b55"

RPROVIDES:${PN} += "libextendedoptionsplugin.so()(64bit) psi+-plugins-extendedoptionsplugin psi+-plugins-extendedoptionsplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
