SUMMARY = "Files needed for developing Ruby scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Ruby scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "ruby-xapian-1.4.21-2.5.aarch64.rpm"
RPM_HASH = "21fdaad3751ba13f3c7f7e4969e977a2924b1b4746f044ed22bd9e5ab4059ff6e029ef33abc9ecd0eb84bbe3c21c17f6d7f148afea27ee98eda34e8320c7d462"

RPROVIDES:${PN} += "ruby-xapian ruby-xapian(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxapian.so.30()(64bit) ruby"

inherit rpm
