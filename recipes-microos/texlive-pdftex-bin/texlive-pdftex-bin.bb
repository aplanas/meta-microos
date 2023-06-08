SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-89.1.aarch64.rpm"
RPM_HASH = "1d4095586869910a314b8a0d51b6fe3685ba50bc5efbf09d3f5fe215f7a9127909b67c25f01e2d4e05fcdc0dde82c4f8389f7979d1eb1b4fa8e078d3650f23d5"

RPROVIDES:${PN} += "texlive-pdftex-bin texlive-pdftex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit) texlive-pdftex"

inherit rpm
