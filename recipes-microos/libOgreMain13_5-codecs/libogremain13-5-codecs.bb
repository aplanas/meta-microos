SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-codecs-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "48a0eed45f268f161d678e9fc2c21cf6d660b5aedf58c98299ed78c410c72b6d060f6d63a7d33253ee6885e6d76047c03b3afebcb8064535250adc97fdb9bc15"

RPROVIDES:${PN} += "libOgreMain-codecs \
libOgreMain13_5-codecs \
libOgreMain13_5-codecs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOgreMain.so.13.5()(64bit) \
libOgreRTShaderSystem.so.13.5()(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libfreeimage.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
