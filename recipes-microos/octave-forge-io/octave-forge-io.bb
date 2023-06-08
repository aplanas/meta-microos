SUMMARY = "Input/Output in external formats from Octave"
DESCRIPTION = "Input/Output in external formats. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "2.6.4"

RPM_NAME = "octave-forge-io-2.6.4-1.7.aarch64.rpm"
RPM_HASH = "fe0ae2a63b7ef22f4081d6af070507eefc84a1fdee31dc95510f296ce6046156286bf225557f3d8f91428060a399bbea361036286212fca2901add441e72d04f"

RPROVIDES:${PN} += "octave-forge-io octave-forge-io(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) octave-cli xerces-j2"

inherit rpm
