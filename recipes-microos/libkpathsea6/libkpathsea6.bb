SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "libkpathsea6-6.3.5-89.1.aarch64.rpm"
RPM_HASH = "4e3a8e4b72532927701961e462a96ff504069a62807bd26bcdbadbdfbacd0b05a88ec91499e8f834780b377e8e11b32e633350ee72f918f53f0ad2f1c7c579ed"

RPROVIDES:${PN} += "libkpathsea.so.6()(64bit) libkpathsea6 libkpathsea6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
