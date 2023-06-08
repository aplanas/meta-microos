SUMMARY = "Binary files of bibtex"
DESCRIPTION = "Binary files of bibtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "aa511281a9e68502b9a2f1c6192fcc7e145c173a452c3f688ce99df05889ffc8bb72ac038f7d149ef8282107532ceae599bd3015ec6d2f809588ac60b135a098"

RPROVIDES:${PN} += "texlive-bibtex-bin texlive-bibtex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-bibtex"

inherit rpm
