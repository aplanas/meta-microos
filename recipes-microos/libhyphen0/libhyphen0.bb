SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "libhyphen0-2.8.8-2.26.aarch64.rpm"
RPM_HASH = "d1fbbc6ffa2eb521bc8c34d8539c8fd060368ff6428d67367f275abad88518511b24a33c0e02f2467d3f23396f2106578e208c18ba47df1ae5ecdb0852044ce9"

RPROVIDES:${PN} += "libhyphen.so.0()(64bit) libhyphen0 libhyphen0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
