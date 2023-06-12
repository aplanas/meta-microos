SUMMARY = "OpenFST Finite State Transducer library"
DESCRIPTION = "OpenFst is a library for constructing, combining, optimizing, and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "3.15.4"

RPM_NAME = "libfst-hfst0-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "69cd700098855bf384e1e3f6f5029b0419de5701cf0b4485e45e96ab208ebd1cd754311dd362b433bec4fe20bc9aa19dc4dc749f3e1d90fb1a27de2476e4ca0d"

RPROVIDES:${PN} += "libfst-hfst.so.0()(64bit) \
libfst-hfst0 \
libfst-hfst0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdl.so.2()(64bit) \
libdl.so.2(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
