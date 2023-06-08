SUMMARY = "Real-valued interval arithmetic for Octave"
DESCRIPTION = "The interval package for real-valued interval arithmetic allows to \
evaluate functions over subsets of their domain.  All results are verified, \
because interval computations automatically keep track of any errors. \
 \
These concepts can be used to handle uncertainties, estimate arithmetic errors \
and produce reliable results.  Also it can be applied to computer-assisted \
proofs, constraint programming, and verified computing. \
 \
The implementation is based on interval boundaries represented by binary64 \
numbers and is conforming to IEEE Std 1788-2015, IEEE standard for interval \
arithmetic. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "octave-forge-interval-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "7cbc307155772224dd08c5e2a2391f346bfc9b4c2b5fcdde0bda6b760fecc374923fc786f23b267ec3775d80286daafbe2875261a2c328601e0531444fa370e1"

RPROVIDES:${PN} += "octave-forge-interval octave-forge-interval(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpfr.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) octave-cli"

inherit rpm
