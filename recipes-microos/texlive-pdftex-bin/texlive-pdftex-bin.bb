SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "851efc337f23bd14095c4fd2dadefbea9d836e5b2b1b0911ec44265856554372dba36dc7a589d9b3ba30c9600adc75801d5d88270daaf9716d1d1c33fd2a0502"

RPROVIDES:${PN} += "texlive-pdftex-bin texlive-pdftex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit) texlive-pdftex"

inherit rpm
