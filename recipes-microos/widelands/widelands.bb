SUMMARY = "Realtime strategy game involving map control"
DESCRIPTION = "Widelands is a real-time strategy (RTS) game with singleplayer \
campaigns and a multiplayer mode. The game was inspired by Settlers II \
(Bluebyte) but has significantly more variety and depth to it. \
 \
The primary goal of this type of RTS is to build a settlement with a \
functioning economy, producing sufficient military units so as to \
conquer rival territories, ultimately gaining control of either the \
entire map, or a certain predetermined section of it."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "widelands-1.1-3.1.aarch64.rpm"
RPM_HASH = "aae23ae6cc291eda22794fca25f9ea40d8f789c5ed5b359d26355a3dd3f8becdbe9be883cbf0a40ab08c28bfc377f55f07041eb3f5739f12a2952d2d6d3c9d3f"

RPROVIDES:${PN} += "application() application(org.widelands.Widelands.desktop) metainfo() metainfo(org.widelands.Widelands.appdata.xml) widelands widelands(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLEW.so.2.2()(64bit) libGLX.so.0()(64bit) libOpenGL.so.0()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) widelands-data"

inherit rpm
