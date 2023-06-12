SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-0_1-1-0.1.3-2.21.aarch64.rpm"
RPM_HASH = "08732b6b947be78fe2dbc18d63a91156eff31a49169e8726ee52447911a40b2a8b2b7fac1ef5ea543def94fd3bf5d8bec45331d4a54faeca48f36cf589f5fca5"

RPROVIDES:${PN} += "libe-book-0.1.so.1()(64bit) libe-book-0_1-1 libe-book-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) liblangtag.so.1()(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
