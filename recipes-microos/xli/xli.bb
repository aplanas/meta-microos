SUMMARY = "X11 Image Loading Utility"
DESCRIPTION = "xli is a version of xloadimage. \
 \
This utility will view several types of images under X11, or load \
images onto the X11 root window."
LICENSE = "MIT"

PV = "1.17+git20170726.0bb4fb4"

RPM_NAME = "xli-1.17+git20170726.0bb4fb4-1.23.aarch64.rpm"
RPM_HASH = "ab827e596ccf1760a0a36112dcf9582b13082b9e702c1da566b1f88c212d599fbc944b0c63ed4166557adff67a5753170f3828f85891ae473bd47e610defed57"

RPROVIDES:${PN} += "xli xli(aarch-64) xli115 xloadimage"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
