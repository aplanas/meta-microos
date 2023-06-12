SUMMARY = "C library for encoding data in a QR Code symbol"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "libqrencode4-4.1.1-1.11.aarch64.rpm"
RPM_HASH = "77161a9963a6531f43b8134706459012dd1f4aae7ece214dd36e78ed7809e18a21f3987856f9d521962a7b9fad3c5af71804921fc1042be4d62508575add6fdf"

RPROVIDES:${PN} += "libqrencode.so.4()(64bit) \
libqrencode4 \
libqrencode4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
