SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dtl-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "2152e97f3ac64c20defd3a5bad9938e93a2cf88c6bee5b444af2af9e71bbb97e812d4c4b33d2e2e216b9d4d43575e1ad7a0aacba8d583aff16babe9bad5b803e"

RPROVIDES:${PN} += "texlive-dtl-bin texlive-dtl-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-dtl"

inherit rpm
