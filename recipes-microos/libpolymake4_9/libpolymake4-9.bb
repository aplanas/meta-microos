SUMMARY = "Library for studying combinatorics and geometry of convex polytopes"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "libpolymake4_9-4.9-1.3.aarch64.rpm"
RPM_HASH = "8e4f73ab03e5d28f32b426ebc90d500a1c16a269296cc4d9034ab02247a6776f2559c8232d962159927a8984b31d7755db68dc231f531da74bbedf0b9d83b98c"

RPROVIDES:${PN} += "libpolymake-apps-rt.so.4.9()(64bit) libpolymake.so.4.9()(64bit) libpolymake4_9 libpolymake4_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libflint.so.17()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libperl.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.2)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
