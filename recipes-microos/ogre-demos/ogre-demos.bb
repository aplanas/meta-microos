SUMMARY = "Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-demos-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "58ca4edf74049adeb609dfcfd2ae47bd4189669535ec1350e3305d735eb8fd87f05366abee58ff831c71d4ceac6811f758ea1adf7557dca580bc416783a4d2b4"

RPROVIDES:${PN} += "ogre-demos ogre-demos(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOgreBites.so.13.5()(64bit) libOgreMain.so.13.5()(64bit) libOgreMain13_5-plugins libOgreMeshLodGenerator.so.13.5()(64bit) libOgreOverlay.so.13.5()(64bit) libOgrePaging.so.13.5()(64bit) libOgreRTShaderSystem.so.13.5()(64bit) libOgreTerrain.so.13.5()(64bit) libOgreVolume.so.13.5()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ogre-media"

inherit rpm
