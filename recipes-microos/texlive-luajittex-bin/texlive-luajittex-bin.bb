SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luajittex-bin-2023.20230311.svn66511-89.1.aarch64.rpm"
RPM_HASH = "aeab95dd0c1adb316380eb6e7d98fa71c7dd5e3913776c6f65f0343a30595ca91515f93604c84a78f8c9a1a019d863def9b2d3079654c547cebcdd4367167091"

RPROVIDES:${PN} += "texlive-luajittex-bin texlive-luajittex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libharfbuzz.so.0()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtexluajit.so.2()(64bit) libz.so.1()(64bit) libzzip.so.13()(64bit) texlive-luajittex"

inherit rpm
