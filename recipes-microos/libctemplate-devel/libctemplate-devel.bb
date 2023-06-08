SUMMARY = "Development files for ctemplate, a C++ language templating library"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate-devel-2.4-1.9.aarch64.rpm"
RPM_HASH = "f2d3af0b571145d2cc8d7ba7f10d4e7df70134aea9c2aa2b5607105e8686b770730c8d07ac80bfe2e1f8afaf651c16b5bd7ad1139d7bcee9a56db952e4729d31"

RPROVIDES:${PN} += "libctemplate-devel libctemplate-devel(aarch-64) pkgconfig(libctemplate) pkgconfig(libctemplate_nothreads)"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libctemplate3 libctemplate_nothreads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
