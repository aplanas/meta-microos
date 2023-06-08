SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-lcdftypetools-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "cd3fb48501f94d6d4a52e1b06661e0627a792d85df6bcea7787e98b21f57d6ab486e74536a88fc643ff1b8e7f07469239fd4d30fd8d9acff2266bb90c0fa4965"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin texlive-lcdftypetools-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) texlive-lcdftypetools"

inherit rpm
