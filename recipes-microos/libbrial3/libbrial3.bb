SUMMARY = "The Polynomials over Boolean Rings Computer Algebra System library"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "libbrial3-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "11b1b36d622c66bf49d0642796bc7dd80d1bd708a317efebc3bbfae00bd50412df7020c21f3a75edf5439a5563ebd0a81a74c54a790c28d747f3594288eca58c"

RPROVIDES:${PN} += "libbrial.so.3()(64bit) libbrial3 libbrial3(aarch-64) libbrial_groebner.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libm4ri-0.0.20200125.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
