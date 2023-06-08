SUMMARY = "Least squares spectral analysis for Octave"
DESCRIPTION = "A package implementing tools to compute spectral decompositions of \
irregularly-spaced time series.  Currently includes functions based off the \
Lomb-Scargle periodogram and Adolf Mathias' implementation for R and C. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-lssa-0.1.4-1.12.aarch64.rpm"
RPM_HASH = "cce06b1e915dd3e182885b42cc77f3839ba15fac8e1a805ac2a1ca6719234ebc2517cb5384d9dd30d669adce8d20721bb93fce85ed679957948a4e0ad8239aaf"

RPROVIDES:${PN} += "octave-forge-lssa octave-forge-lssa(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) octave-cli"

inherit rpm
