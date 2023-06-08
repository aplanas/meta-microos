SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "python310-xapian-1.4.21-2.5.aarch64.rpm"
RPM_HASH = "faaa5f1e1f1ed2cd2cf7bf690cc4a6ef27d766369dd88ac3ea63460646620f4cdeef6c88f7b4be3e6afe39c18855c4302e3ec92bbae6e03ed7cda16a2d165fae"

RPROVIDES:${PN} += "python3-xapian python310-xapian python310-xapian(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxapian.so.30()(64bit) python(abi)"

inherit rpm
