SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luahbtex-bin-2023.20230311.svn66511-89.1.aarch64.rpm"
RPM_HASH = "d4868e24b4d3e5a32fb0138abe9b5de58fe351b449b02f9308d88ed424dd666cd7ddd82211bd3f1e424aacb1eff2bc57eab41a0f2859a884e9056cf1184df659"

RPROVIDES:${PN} += "texlive-luahbtex-bin texlive-luahbtex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libharfbuzz.so.0()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtexlua53.so.5()(64bit) libz.so.1()(64bit) libzzip.so.13()(64bit) texlive-luahbtex"

inherit rpm
