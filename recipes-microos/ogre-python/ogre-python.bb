SUMMARY = "Python bindings for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-python-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "282a7213ccd0bd51a59fc540a6dc4c6339f99173178c44d565da1596bb09baeea2890ca85bf9c8da5fbdfb65472218f09e9fb686198efb9de0505da177b574b6"

RPROVIDES:${PN} += "ogre-python \
ogre-python(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOgreBites.so.13.5()(64bit) \
libOgreMain.so.13.5()(64bit) \
libOgreOverlay.so.13.5()(64bit) \
libOgreRTShaderSystem.so.13.5()(64bit) \
libOgreTerrain.so.13.5()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
