SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "fb19ee6d12fc4a15340df084a2747df89704c5a3826799405f6f52bd8a060cc8ec77ea08b1ac3030a0fa85a115fcbc290f0103ad73538a12e13409a02c307366"

RPROVIDES:${PN} += "imlib2 \
imlib2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
