SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tie-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "6941f7b31f36fcbe3c04eed7aa5708f31597e47e4e2af14828a658269f3ad83277ca28a78c81401712ab996ce21b14a7daef4ea3b0e7cd12e2158218a9e1131d"

RPROVIDES:${PN} += "texlive-tie-bin texlive-tie-bin(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-tie"

inherit rpm
