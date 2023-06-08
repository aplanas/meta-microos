SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvips-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "14e0ea8285b0a8e24170a02c2e0fb27850667cb7a280064266b13776149dcd020f394e3b0f14e058eff2f26cd9d2b22da4bf644d8fa06236448b77a24090b69a"

RPROVIDES:${PN} += "texlive-dvips-bin texlive-dvips-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) texlive-dvips"

inherit rpm
