SUMMARY = "Python3 bindings for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. \
 \
This package provides python3 bindings for fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "python3-fastjet-3.4.0-2.8.aarch64.rpm"
RPM_HASH = "dbb45ded039383390b993391cd672ef91a05611fcdc5e742fb094be935d86356e68f05ff43aa55a75efa2dbe18cbfbd6495e310d03dac4d5f9c37dd26b2efca2"

RPROVIDES:${PN} += "python3-fastjet python3-fastjet(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfastjet.so.0()(64bit) libfastjettools.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
