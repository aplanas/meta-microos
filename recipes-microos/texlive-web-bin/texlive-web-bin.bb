SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-web-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "19234cf19cc4924bec9b7da5550de9bcc7d567697d700154a304671b67023ab72f27e0fbd5c4dad94443f6b6ecded9850e5d2c2672326b2f055ffdf1a1f9d9d6"

RPROVIDES:${PN} += "texlive-web-bin texlive-web-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-web"

inherit rpm
