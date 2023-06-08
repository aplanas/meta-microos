SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luatex-bin-2023.20230311.svn66511-89.1.aarch64.rpm"
RPM_HASH = "c35cd72ebc318f9c46eb7d5be0686613bc41ba8518f3b0d468f2dcd359b464856290bfe8c822d6ce09d271b3614b0b3ec1c33af697ebd8b1e7907a6b8546807e"

RPROVIDES:${PN} += "texlive-luatex-bin texlive-luatex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtexlua53.so.5()(64bit) libz.so.1()(64bit) libzzip.so.13()(64bit) texlive-luatex"

inherit rpm
