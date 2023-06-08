SUMMARY = "The Flexible Isometric Free Engine, a 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libfife0_4_2-0.4.2-5.16.aarch64.rpm"
RPM_HASH = "aae1c5b22c7a24e038d349ee70d5287a82fcf0f17457aaa5af5958f4fcc4dee3465259e82056c133ae1e87ff313ddde347dd0b642a897561f37e404b445f1bbe"

RPROVIDES:${PN} += "libfife.so.0.4.2()(64bit) libfife0_4_2 libfife0_4_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLEW.so.2.2()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_ttf-2.0.so.0()(64bit) libboost_filesystem.so.1.82.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libfifechan.so.0.1.5()(64bit) libfifechan_opengl.so.0.1.5()(64bit) libfifechan_sdl.so.0.1.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinyxml.so.0()(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
