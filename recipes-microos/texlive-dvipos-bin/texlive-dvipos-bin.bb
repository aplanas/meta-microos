SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-dvipos-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "7d9bdc8acf6f03a6e90f5c8aa98351f10d69961d92191991eb93001cae40ab5b1add9b761e683aabaeec8c2091e5ea27a625d6b432ffe5e0c80e4a29375b9e1f"

RPROVIDES:${PN} += "texlive-dvipos-bin texlive-dvipos-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-dvipos"

inherit rpm
