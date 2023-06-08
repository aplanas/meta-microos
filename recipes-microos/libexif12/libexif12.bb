SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.24"

RPM_NAME = "libexif12-0.6.24-1.9.aarch64.rpm"
RPM_HASH = "bd3807cc592262d6ba2a315b7bcd7c6432ed5dfe575843d72de93673740c2373664c0de028bca24d3e73ebf7c429415e15d09dc063cd2a25fdc2a3426e34d89d"

RPROVIDES:${PN} += "libexif libexif.so.12()(64bit) libexif12 libexif12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
