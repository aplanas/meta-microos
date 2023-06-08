SUMMARY = "An ZMF generator library"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-0_0-0-0.0.2-1.43.aarch64.rpm"
RPM_HASH = "abdcbcf09ef43285e60584edc2026c0520989f81cafd2e96a733a6abe64ea79f4e44afddf7ba87502c720cdbab2c9ff6626eb877bb5e0b1bea8eea81c5e4dd61"

RPROVIDES:${PN} += "libzmf-0.0.so.0()(64bit) libzmf-0_0-0 libzmf-0_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
