SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python310-opengl-accelerate-3.1.6-1.9.aarch64.rpm"
RPM_HASH = "8ed2d9681a1bc8ef7f7a6efca5210f37c8ecfb2c7b6a05135ae6dacd1cbe0d374f527ab9b5991a80d997d1f3d3796f7cd58806507c96d5cd4cf73383deb1ad4a"

RPROVIDES:${PN} += "python3-PyOpenGL_accelerate python3-opengl-accelerate python3.10dist(pyopengl-accelerate) python310-PyOpenGL_accelerate python310-opengl-accelerate python310-opengl-accelerate(aarch-64) python3dist(pyopengl-accelerate)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-opengl"

inherit rpm
