SUMMARY = "2D motocross platform game"
DESCRIPTION = "X-Moto is a challenging 2D motocross platform game, where physics play \
an all important role in the gameplay. You need to control your bike to \
its limit, if you want to have a chance finishing the more difficult of \
the challenges.  First you'll try just to complete the levels, while \
later you'll compete with yourself and others, racing against the \
clock."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "xmoto-0.6.2-1.3.aarch64.rpm"
RPM_HASH = "c08e7ced4a94ffc484730da1bf40f69ae964bd2af75e498144818f0196c758e559090aff8a4e8480a21940af7e32a710077ce7b1af5ff4493acf53fc3a358ccb"

RPROVIDES:${PN} += "application() application(xmoto.desktop) metainfo() metainfo(xmoto.appdata.xml) xmoto xmoto(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLU.so.1()(64bit) libOpenGL.so.0()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) libSDL2_mixer-2.0.so.0()(64bit) libSDL2_net-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) xmoto-data"

inherit rpm
