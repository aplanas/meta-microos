SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-afm2pl-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "d5923306982cfa7d00284ba3bc09cb42cfb00d17118fc99d79e9b078ceffd7471e84dd2ba4f624c22c1af9675db43089de62bfb8f34c3e6ca366245ce79713c0"

RPROVIDES:${PN} += "texlive-afm2pl-bin texlive-afm2pl-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) texlive-afm2pl"

inherit rpm
