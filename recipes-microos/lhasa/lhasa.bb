SUMMARY = "Program to unpack LHARC archives"
DESCRIPTION = "Lhasa is a replacement for the Unix LHA tool, for decompressing \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.3.1"

RPM_NAME = "lhasa-0.3.1-1.24.aarch64.rpm"
RPM_HASH = "4d63734011a272a4f0f803ba2178f2951cbe9ff56e198350676f3963186b0d5873a5aaf1cf67fa75bd224bfd56d487d8c9ae69432db0573d563e12a047b62211"

RPROVIDES:${PN} += "lhasa lhasa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblhasa.so.0()(64bit)"

inherit rpm
