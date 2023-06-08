SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvidvi-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "17af7b74d647811c0cb17e03dbb60077c6ccbdc0f6f0b4d5a61063bbb572c89cf4365e5184c45d2b0bd6c80430326d938badc94830cbcdc8fe6d5349612e2c77"

RPROVIDES:${PN} += "texlive-dvidvi-bin texlive-dvidvi-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-dvidvi"

inherit rpm
