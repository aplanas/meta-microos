SUMMARY = "Nonlinear Time Series Analysis"
DESCRIPTION = "TISEAN stands for TIme SEries ANalysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "octave-forge-tisean-0.2.3-2.1.aarch64.rpm"
RPM_HASH = "b478970e845889610b4c3afc1c00638ddfdbf2c1eb95bead4976d06d19e0a9bf42a6d9e1e985f7141025549e6f6a5376e1c6c40c81cf8dd565d6281369d71851"

RPROVIDES:${PN} += "octave-forge-tisean octave-forge-tisean(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) octave-cli octave-forge-signal"

inherit rpm
