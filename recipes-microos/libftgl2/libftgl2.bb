SUMMARY = "Library for Using Arbitrary Fonts in OpenGL Applications"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libftgl2-2.4.0-1.14.aarch64.rpm"
RPM_HASH = "d614e10f84b3adf9dc56158389781cdb3499b057772b80817de0b10c3642e5e6ce59bda5d930f1c80edaf367e5af1e83486ae12f6dd0bf39963a55b0e23a1641"

RPROVIDES:${PN} += "libftgl.so.2()(64bit) libftgl2 libftgl2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
