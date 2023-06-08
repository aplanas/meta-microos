SUMMARY = "OpenGL utility library"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package provides the SGI implementation of GLU previously shipped \
with Mesa, but meanwhile developed separately."
LICENSE = "SGI-B-2.0"

PV = "9.0.2"

RPM_NAME = "libGLU1-9.0.2-2.3.aarch64.rpm"
RPM_HASH = "2aa4bfa561fb54cb60e84aa6daee3ce036825ec435a099019ce5035ac0bbafa5f1548ca72387beb14fa4506b8d4c048de0d70048f097e03b4c267d9088417bc6"

RPROVIDES:${PN} += "Mesa-libGLU1 libGLU.so.1()(64bit) libGLU1 libGLU1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
