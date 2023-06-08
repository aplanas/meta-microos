SUMMARY = "Shared library for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. The objective is to provide as accurate as \
possible a representation of event properties in a wide range of \
reactions, within and beyond the Standard Model, with emphasis on \
those where strong interactions play a role, directly or indirectly, \
and therefore multihadronic final states are produced. The physics is \
then not understood well enough to give an exact description; instead \
the program has to be based on a combination of analytical results and \
various QCD-based models. Extensive information is provided on all \
program elements: subroutines and functions, switches and parameters, \
and particle and process data. This should allow the user to tailor \
the generation task to the topics of interest. \
 \
This package provides the shared libraries for pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "libpythia8-8.307-1.14.aarch64.rpm"
RPM_HASH = "0116277c8fe5eec86851e54275493f8910f8cd02010fa6233b71318db6454761bd54fd008944459eb4f932238191be5b00cf35f50acb92c3764d13994b1b7ba8"

RPROVIDES:${PN} += "libpythia8 libpythia8(aarch-64) libpythia8.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
