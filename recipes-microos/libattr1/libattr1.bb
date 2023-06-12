SUMMARY = "A dynamic library for filesystem extended attribute support"
DESCRIPTION = "This package contains the libattr.so dynamic library, which contains \
the extended attribute library functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr1-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "f81e0b8c5922a8a459ffe6803e5ea6554112ae0d2f5dbd0e4888c2e2e44725daaa3b440b9143f53c599e5be62dd180e2987b7224235745b6352b209b78d408cd"

RPROVIDES:${PN} += "config(libattr1) \
libattr \
libattr.so.1()(64bit) \
libattr.so.1(ATTR_1.0)(64bit) \
libattr.so.1(ATTR_1.1)(64bit) \
libattr.so.1(ATTR_1.2)(64bit) \
libattr.so.1(ATTR_1.3)(64bit) \
libattr1 \
libattr1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
