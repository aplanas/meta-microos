SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to work efficiently and comfortably with the Juick \
microblogging service."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-juickplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "ca2177f477a41a7b1cb11532e4abbc7b39a9c005f402bae523347f885d44718c5c57f5394cf6f16be3f579b6f21fa9df7151ef48de9fa907c8009200e2b87a1b"

RPROVIDES:${PN} += "libjuickplugin.so()(64bit) \
psi+-plugins-juickplugin \
psi+-plugins-juickplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
psi+"

inherit rpm
