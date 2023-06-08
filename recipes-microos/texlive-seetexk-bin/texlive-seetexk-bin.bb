SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-seetexk-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "dd8d66f373feaae79cfad293a6301bcd901a0bf04a813d8fa43c76d1a2b1bcb37bcc2b40f8cc23ccf14a8db446a459333b1c339d90a43099b7258a1944caf851"

RPROVIDES:${PN} += "texlive-seetexk-bin texlive-seetexk-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/csh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-seetexk"

inherit rpm
