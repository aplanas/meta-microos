SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libImlib2-1-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "c0ebda994c39d4416c432f793d6a1772bb9b33a111256bef622e486a2883aa539f29fc3741b258b2a5470343555998072f6345fa35d4828057dc1fd817d9859d"

RPROVIDES:${PN} += "libImlib2-1 libImlib2-1(aarch-64) libImlib2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libxcb-shm.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
