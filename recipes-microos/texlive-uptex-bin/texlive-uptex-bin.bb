SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-91.1.aarch64.rpm"
RPM_HASH = "ec830b32b4a860f1d3d6de7d64d3ad5ef3ae5cedd97940106a429aed934dda2d18b4521c0940cd9534ac1de427e435d0500803a289ef9ade9cb2f9a7154821e6"

RPROVIDES:${PN} += "texlive-uptex-bin \
texlive-uptex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libptexenc.so.1()(64bit) \
libz.so.1()(64bit) \
texlive-uptex"

inherit rpm
