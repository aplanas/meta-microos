SUMMARY = "An EPUB generator library"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-0_1-1-0.1.1-1.21.aarch64.rpm"
RPM_HASH = "f72516911b3aeb3cfd0d2fa9ffe8768340cd3fd7429cce8f7784ed80497d5d2a90df85657574d0d36cc1aabfeacb876f231f1e88fcd987139b364da35a287be1"

RPROVIDES:${PN} += "libepubgen-0.1.so.1()(64bit) libepubgen-0_1-1 libepubgen-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
