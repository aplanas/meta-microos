SUMMARY = "A decompression library for the LHARC data format"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.3.1"

RPM_NAME = "liblhasa0-0.3.1-1.24.aarch64.rpm"
RPM_HASH = "e9ea237180dc1815ac266e1c4de235c851647395a527a45597520b3156ee987494ec69f609b2d3309f95338e133ea0c1d523146df7abb891f1ac712c2b5e582d"

RPROVIDES:${PN} += "liblhasa.so.0()(64bit) liblhasa0 liblhasa0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
