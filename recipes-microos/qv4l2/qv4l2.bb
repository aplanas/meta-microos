SUMMARY = "Video4linux test control and streaming test application"
DESCRIPTION = "qv4l2 is a test control and streaming test application for video4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.24.1"

RPM_NAME = "qv4l2-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "5cd52abd6e0f7bd68f2dd74b8c6811e2be905bc77f8baf711f407ec498cf431e4c5e2d977df220960b5c6070fa1ad5152c8ecb13abf7925a9ea5394bce69c4be"

RPROVIDES:${PN} += "application() \
application(qv4l2.desktop) \
qv4l2 \
qv4l2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libv4l \
libv4l2.so.0()(64bit) \
libv4lconvert.so.0()(64bit)"

inherit rpm
