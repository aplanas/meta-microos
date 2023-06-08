SUMMARY = "Library to manipulate F2 filesystems"
DESCRIPTION = "This package contains a shared library used for manipulation of F2 \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libf2fs9-1.15.0-2.3.aarch64.rpm"
RPM_HASH = "afebb41be73c8518efbef588eef0b42e46c12d6379bdf3fa856759a1abdf65c0b49415ce502a03454558872e84f3052e63be84db618dbdf1c4f4087520cfb0ed"

RPROVIDES:${PN} += "libf2fs.so.9()(64bit) libf2fs9 libf2fs9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
