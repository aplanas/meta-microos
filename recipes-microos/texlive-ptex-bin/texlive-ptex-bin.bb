SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-89.1.aarch64.rpm"
RPM_HASH = "8f25f47c641a2a8d046a9bb33c2beb978786fe939881a9be033e1c21ca82cd2a3f3bb864fc29c4036ba3d724258cfcddbd2353d9fc1e013eb82926a4439c6928"

RPROVIDES:${PN} += "texlive-ptex-bin texlive-ptex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libptexenc.so.1()(64bit) libz.so.1()(64bit) texlive-ptex"

inherit rpm
