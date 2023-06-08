SUMMARY = "Classic Breakout-Style Game"
DESCRIPTION = "LBreakoutHD is a scaleable 16:9 remake of LBreakout2, a Breakout-style \
arcade game for Linux featuring a number of added graphical enhancements \
and effects. You control a paddle at the bottom of the playing field \
and must destroy bricks at the top by bouncing balls against them."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "lbreakouthd-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "50a56a399fb6cd2438f8d712741a17c6ddc89509aeae96e4f878965ee84f79de5c7fee1e1433cd4d2388449d57b8ae5a8b8416a5c532b3a182d5d6184f479a6b"

RPROVIDES:${PN} += "application() application(lbreakouthd.desktop) lbreakouthd lbreakouthd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) user(games)"

inherit rpm
