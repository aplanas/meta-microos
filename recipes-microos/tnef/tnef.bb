SUMMARY = "Uncompress MS-TNEF Archives"
DESCRIPTION = "This tool uncompresses MS-TNEF archives as used by some mailers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.18"

RPM_NAME = "tnef-1.4.18-2.1.aarch64.rpm"
RPM_HASH = "46d5a12196cbc4113fa97f831cd65808247cd2589fedc70a6b307ee79eb0e68ed7e97838717c8adeb1215661efe12a3e72a6ac3230de12391a7b019431deebd0"

RPROVIDES:${PN} += "tnef tnef(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
