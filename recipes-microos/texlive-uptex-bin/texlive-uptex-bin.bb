SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-89.1.aarch64.rpm"
RPM_HASH = "b28238c259c4cbbd8ced1886ed1657586a6d088fd331379d8809318c154fee70547f0413b3042f2c8878cc9a6b5f980e98c89d4ea53363a117fe0483aa3b5b32"

RPROVIDES:${PN} += "texlive-uptex-bin texlive-uptex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libptexenc.so.1()(64bit) libz.so.1()(64bit) texlive-uptex"

inherit rpm
