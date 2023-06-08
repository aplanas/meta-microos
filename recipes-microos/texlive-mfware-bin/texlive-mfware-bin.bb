SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mfware-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "37788b3d48adb51c0a5e649f907211b1b2611c51afa0efd3e9afbfcf13fc5545645488a587d3278fc6d8d5432c20961cd77ddf6739c74c4b30ce2e2e74b48220"

RPROVIDES:${PN} += "texlive-mfware-bin texlive-mfware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-mfware"

inherit rpm
