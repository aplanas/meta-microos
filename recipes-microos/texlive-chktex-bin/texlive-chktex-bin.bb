SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-chktex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "91ccb577b71d6119ddb0d5eb783598fba345122d2d6227c25dd370d9510bca113545a05cada055c91c58a7edfd2c4475b8f37000114375cadca956bd065b479e"

RPROVIDES:${PN} += "texlive-chktex-bin texlive-chktex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-chktex"

inherit rpm
