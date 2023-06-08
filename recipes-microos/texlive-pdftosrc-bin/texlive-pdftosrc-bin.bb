SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pdftosrc-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "c6240835fcb90c96414202c03f75f5cfefa1aa3d5810278329ff623772a069b1ea99761ab29b66d0e621bec5a014b33587e7356979b63d0e3832f1a51305d3e3"

RPROVIDES:${PN} += "texlive-pdftools-bin:/usr/bin/pdftosrc texlive-pdftosrc-bin texlive-pdftosrc-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) texlive-pdftosrc"

inherit rpm
