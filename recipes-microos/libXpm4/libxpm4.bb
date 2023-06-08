SUMMARY = "X Pixmap image file format library"
DESCRIPTION = "libXpm facilitates working with XPM (X PixMap), a format for \
storing/retrieving X pixmaps to/from files."
LICENSE = "MIT"

PV = "3.5.16"

RPM_NAME = "libXpm4-3.5.16-1.1.aarch64.rpm"
RPM_HASH = "8be7fe82c0a42a211c8d6b207d2cfb09d5afdfdf4c0dcaf7d60f4f8418c1e61791f79c3f7450acceab08a6618223995fac36847ff837954fc631940a1f4fbd39"

RPROVIDES:${PN} += "libXpm.so.4()(64bit) libXpm4 libXpm4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/gzip /usr/bin/uncompress ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
