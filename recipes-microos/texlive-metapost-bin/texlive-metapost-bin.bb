SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metapost-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "ed64aa7dc1a611dec46a101cf0ecb5fa0ae536d4a5c4641b10d6a781347a2a6037fc43c5623e08b3e40f5977f6e4848bb7dd5f70537159e65195b538a7581e64"

RPROVIDES:${PN} += "texlive-metapost-bin texlive-metapost-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit) texlive-metapost"

inherit rpm
