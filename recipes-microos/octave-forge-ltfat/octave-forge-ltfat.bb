SUMMARY = "The Large Time-Frequency Analysis Toolbox for Octave"
DESCRIPTION = "The Large Time/Frequency Analysis Toolbox (LTFAT) is a Matlab/Octave toolbox \
for working with time-frequency analysis, wavelets and signal processing. \
It is intended both as an educational and a computational tool. The toolbox \
provides a large number of linear transforms including Gabor and wavelet \
transforms along with routines for constructing windows (filter prototypes) \
and routines for manipulating coefficients. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.0"

RPM_NAME = "octave-forge-ltfat-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "0c558bf03b8d064986d82c8bd8977cf2d9966988182e82fe81f3356dfc9a3f0459f734b6a7d1e3526f12ccf5e4255ca5c9b2d445becdd029bfad619c3248db23"

RPROVIDES:${PN} += "octave-forge-ltfat octave-forge-ltfat(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfftw3.so.3()(64bit) libfftw3f.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas.so.0()(64bit) libportaudio.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) octave-cli"

inherit rpm
