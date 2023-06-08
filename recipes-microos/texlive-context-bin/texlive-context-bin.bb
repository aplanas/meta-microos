SUMMARY = "Binary files of context"
DESCRIPTION = "Binary files of context"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66562"

RPM_NAME = "texlive-context-bin-2023.20230311.svn66562-89.1.aarch64.rpm"
RPM_HASH = "27f0287d4d7a74e90bfa3edf7f0eb2c2f8184f0128819ab4eba7a028170c306b4c7d9fdab30dfbdc0d813e71c355940a9d77d0a9abcf858d32ae871c0c6a2701"

RPROVIDES:${PN} += "texlive-context-bin texlive-context-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) texlive-context"

inherit rpm
