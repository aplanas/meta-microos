SUMMARY = "Boost.IOStreams Runtime Libraries"
DESCRIPTION = "This package contains the Boost.IOStreams Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_iostreams1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "d071a5ec0335aebe5fdc32cc6e943a5c0d850ced84aeedb35a39aa21bf4bc7d10c6029c7da64ae1a2fe3eb5bdad6a8548293bf292de7e7e449f5f933ed7d8131"

RPROVIDES:${PN} += "libboost_iostreams.so.1.82.0()(64bit) libboost_iostreams1_82_0 libboost_iostreams1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzma.so.5(XZ_5.2)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
