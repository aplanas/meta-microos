SUMMARY = "A tool for transforming PDF documents"
DESCRIPTION = "PaperJam is a tool for processing PDF documents: re-ordering pages, \
scaling and rotating them, placing multiple pages on one sheet of paper, \
adding cropmarks, and many other tricks."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "paperjam-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "c797d7274b43a20f85173504eeec3f07da0bca235d856e69aa6118732bc8f3a1bc7f7c1da878e9d152299728096a058279d9bd6f5781def11881633d535a9d18"

RPROVIDES:${PN} += "paperjam paperjam(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpaper.so.2()(64bit) libqpdf.so.29()(64bit) libqpdf.so.29(LIBQPDF_29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
