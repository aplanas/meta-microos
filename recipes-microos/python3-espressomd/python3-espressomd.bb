SUMMARY = "Parallel simulation software for soft matter research"
DESCRIPTION = "ESPResSo is a highly versatile software package for performing and analyzing \
scientific Molecular Dynamics many-particle simulations of coarse-grained \
atomistic or bead-spring models as they are used in soft-matter research in \
physics, chemistry and molecular biology. It can be used to simulate systems \
such as polymers, liquid crystals, colloids, ferrofluids and biological \
systems, for example DNA and lipid membranes."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "python3-espressomd-4.2.1-2.1.aarch64.rpm"
RPM_HASH = "9df9a757c67d7b75d85ab11d4a72f836fd9c854f954d7cc8e11f0882325b7ad82b475fcaec5e1a8dee08b07f230f73c6f13185c5c5a0f0178b06c4cf42bdab64"

RPROVIDES:${PN} += "libEspresso4 python3-espressomd python3-espressomd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_mpi.so.1.82.0()(64bit) libboost_serialization.so.1.82.0()(64bit) libc.so.6(GLIBC_2.33)(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgsl.so.27()(64bit) libgslcblas.so.0()(64bit) libhdf5-openmpi4 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.40()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi) python3-h5py python3-numpy"

inherit rpm
