SUMMARY = "LAMMPS library"
DESCRIPTION = "LAMMPS is a classical molecular dynamics code, and an acronym for Large-scale \
Atomic/Molecular Massively Parallel Simulator. \
 \
LAMMPS has potentials for soft materials (biomolecules, polymers) and \
solid-state materials (metals, semiconductors) and coarse-grained or \
mesoscopic systems. It can be used to model atoms or, more generically, as a \
parallel particle simulator at the atomic, meso, or continuum scale. \
 \
LAMMPS runs on single processors or in parallel using message-passing \
techniques and a spatial-decomposition of the simulation domain. The code is \
designed to be easy to modify or extend with new functionality. \
 \
This package contains the library of LAMMPS package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "liblammps0-20201029-4.3.aarch64.rpm"
RPM_HASH = "ed50da796fe3739845821655d19bce09865a4c36780c770ac7e078f1f99e237d45acd268359bb77aaea33dd23fe960adccb37e19b642ba90488a96d273b0f964"

RPROVIDES:${PN} += "liblammps.so.0()(64bit) liblammps0 liblammps0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libOpenCL.so.1(OPENCL_1.2)(64bit) libc.so.6(GLIBC_2.33)(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libkim-api.so.2()(64bit) libkokkoscore.so.3.3.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.40()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvoro++.so.0()(64bit)"

inherit rpm
