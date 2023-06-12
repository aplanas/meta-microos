SUMMARY = "Xt OpenGL drawing area widget library"
DESCRIPTION = "Xt OpenGL drawing area widget library shipped by the Mesa Project."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLw1-8.0.0-7.3.aarch64.rpm"
RPM_HASH = "d61cbdc36bfd466ae5490aab7c5dda6b68d9fd67a1a8168b03a0fd4b518fd486351c3a2f30e1cef08cb1846b6caf96aa51d3d85737a3f76a9fef49aaf4b2d514"

RPROVIDES:${PN} += "GLw1 \
MesaGLw \
libGLw.so.1()(64bit) \
libGLw1 \
libGLw1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
