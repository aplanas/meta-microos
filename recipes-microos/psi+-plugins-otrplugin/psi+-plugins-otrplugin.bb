SUMMARY = "Plugin for Psi"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations over \
instant messaging."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-otrplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "f7ff9955921eb4c53cc02e23901a628459423f77d6d61c5c0a7e2de6581def6a75bd92bef5a8dff3bb6ac4178f2451d3a1282cef1b2840dd5e8d0ac95c618dee"

RPROVIDES:${PN} += "libotrplugin.so()(64bit) \
psi+-plugins-otrplugin \
psi+-plugins-otrplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libotr.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtidy.so.58()(64bit) \
psi+"

inherit rpm
