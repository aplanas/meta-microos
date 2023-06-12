SUMMARY = "A remake of the classic arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This package includes the client binary with built-in server."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-0.7-4.6.aarch64.rpm"
RPM_HASH = "f19d3378737203bc0355ac0a8570bc7c449ca9c368bd257b211963b2c3bc954e0d7e8c3bdea4e224119e1a2add80bfce1b55c4af530405c682581b5ba0c34fd2"

RPROVIDES:${PN} += "application() \
application(kajaani-kombat-fullscreen.desktop) \
application(kajaani-kombat.desktop) \
kajaani-kombat \
kajaani-kombat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_net-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
