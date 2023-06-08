SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python39-opengl-accelerate-3.1.6-1.9.aarch64.rpm"
RPM_HASH = "856bf990b2792107bd37bc99a8fb54bdb52eeeab83dfa8f9ff9b8fff81771f678e9a65dab09a11d3374e0bdc252aec553acb248a601c707e2e713d507d24d3ef"

RPROVIDES:${PN} += "python3.9dist(pyopengl-accelerate) python39-PyOpenGL_accelerate python39-opengl-accelerate python39-opengl-accelerate(aarch-64) python3dist(pyopengl-accelerate)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-opengl"

inherit rpm
