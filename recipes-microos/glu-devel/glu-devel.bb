SUMMARY = "Development files for the GLU API"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package contains includes headers and static libraries for \
compiling programs with GLU."
LICENSE = "SGI-B-2.0"

PV = "9.0.2"

RPM_NAME = "glu-devel-9.0.2-2.3.aarch64.rpm"
RPM_HASH = "a5dc165970bc3f5fab108f117b9ae8d53fcec2bb3ac8ce15d7f884c04e2950fc6adbbcea8fc43162222041bdcbe49ff8cb40ee39c497917c04d660da5f3f2fb3"

RPROVIDES:${PN} += "Mesa-libGLU-devel glu-devel glu-devel(aarch-64) pkgconfig(glu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libGLU1 pkgconfig(gl)"

inherit rpm
