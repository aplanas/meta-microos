SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to create, store and apply skins to Psi."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-skinsplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "77bbf6912046bd8c23d8656e6571a7a14c453c019d746f345dc05290c19ea8feb190c31fa57feed8b33ec22f836c562b60649d220435de9d71ca4aad42f7f464"

RPROVIDES:${PN} += "libskinsplugin.so()(64bit) psi+-plugins-skinsplugin psi+-plugins-skinsplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) psi+"

inherit rpm
