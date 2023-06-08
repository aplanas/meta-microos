SUMMARY = "Mono bindings OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-mono-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "8387b0060ccaa302f40f9ca6cdd1fe8fca479e51bb6831e2f63c20baa183e515ff9cd98cde935c15ff805663c8df36d5b7dd73fd888ed63a4bf13375876dcb83"

RPROVIDES:${PN} += "libOgre.so()(64bit) ogre-mono ogre-mono(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOgreBites.so.13.5()(64bit) libOgreMain.so.13.5()(64bit) libOgreOverlay.so.13.5()(64bit) libOgreRTShaderSystem.so.13.5()(64bit) libOgreTerrain.so.13.5()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
