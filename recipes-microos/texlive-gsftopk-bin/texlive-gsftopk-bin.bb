SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gsftopk-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "38a8c058b63f80366030a8b3a64d624600c1f4d26e4b763a50a776a3f239546bdd9a32ba2eda56cf87aff10c46a226feba5aad9f03a4fdca500401717a9cc5b3"

RPROVIDES:${PN} += "texlive-gsftopk-bin texlive-gsftopk-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-gsftopk"

inherit rpm
