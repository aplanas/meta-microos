SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66562"

RPM_NAME = "texlive-context-bin-2023.20230311.svn66562-91.1.aarch64.rpm"
RPM_HASH = "8601aee93b6c5de116d9bb4b1e03beebccb5e2fd38288c4f5ca902e3981f7a3c9a0ed28dc284db5bc0613b47a732a32b4a6d6310c0cad7e303f2ebb13cfdca08"

RPROVIDES:${PN} += "texlive-context-bin \
texlive-context-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
texlive-context"

inherit rpm
