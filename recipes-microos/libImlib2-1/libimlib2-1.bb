SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "libImlib2-1-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "6cf407d91d0bd2b17ca005fb09bb1d4c4478eb358480c26214c23d6bc0dbefb1d0d75842a810b6dc022c0399237252bac5002761cbf1f73c46bf7621868c13bc"

RPROVIDES:${PN} += "libImlib2-1 libImlib2-1(aarch-64) libImlib2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libxcb-shm.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
