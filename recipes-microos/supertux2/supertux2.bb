SUMMARY = "Jump'n run game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a similar \
style like the original SuperMario games."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later & GPL-2.0-or-later & GPL-1.0-only"

PV = "0.6.3"

RPM_NAME = "supertux2-0.6.3-2.9.aarch64.rpm"
RPM_HASH = "512919c73000a07ee0d7b6423a275e473ad1bb909c5fecc4a3c7ae894f628b886aab0521f6ccf4362d3cdb3395ab4c94320148c298e7b1f212bf1213dbd7e0a5"

RPROVIDES:${PN} += "application() application(supertux2.desktop) metainfo() metainfo(supertux2.appdata.xml) supertux2 supertux2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLEW.so.2.2()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2_image-2.0.so.0()(64bit) libboost_filesystem.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libphysfs.so.1()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libraqm.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
