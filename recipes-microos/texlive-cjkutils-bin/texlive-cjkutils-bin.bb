SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cjkutils-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "682f338b5adb53d3bf77723b9f86a45c59829960d7c3179468890578ccee2369f358eb00da185e8b9231d36130b4394720e41af8b78de11da6585e44a71d4e36"

RPROVIDES:${PN} += "texlive-cjkutils-bin texlive-cjkutils-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-cjkutils"

inherit rpm
