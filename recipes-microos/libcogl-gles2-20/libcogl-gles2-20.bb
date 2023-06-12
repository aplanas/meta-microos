SUMMARY = "OpenGL ES 2 support for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures"
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-gles2-20-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "8e2dfcc0295a3d76a8ad0879ed1e6f41ec8b5f05df820d407a1430ef0b0f3d7c5035e788ca720435cee78b3ab4222547d8c5ff8ec6ebcd7c37b2a0d5d01d67e0"

RPROVIDES:${PN} += "libcogl-gles2-20 \
libcogl-gles2-20(aarch-64) \
libcogl-gles2.so.20()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libcogl.so.20()(64bit)"

inherit rpm
