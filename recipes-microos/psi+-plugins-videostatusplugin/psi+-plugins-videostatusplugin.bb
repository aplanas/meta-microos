SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to set the custom status when you see the video in \
selected video player."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-videostatusplugin-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "2c980aa98ad53128d639dc4b1dcef35f0c9b43f7a3d876a1b75a71ce53e5122b3f8bee9ef67b93c30a46cd9bc35399774bc08bdb36a5d2b702c8f9fe735c8bca"

RPROVIDES:${PN} += "libvideostatusplugin.so()(64bit) psi+-plugins-videostatusplugin psi+-plugins-videostatusplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb.so.1()(64bit) psi+"

inherit rpm
