SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-0_1-1-0.1.3-2.20.aarch64.rpm"
RPM_HASH = "ad5aad571574fbf76fa9bd840f856358e2e4e0047f7ea6156c66af2edaad73f08f088e00a419e1e82c1f5072823cfc00fa73d9c64b8e7c5230762c15ad9fb969"

RPROVIDES:${PN} += "libe-book-0.1.so.1()(64bit) libe-book-0_1-1 libe-book-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) liblangtag.so.1()(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
