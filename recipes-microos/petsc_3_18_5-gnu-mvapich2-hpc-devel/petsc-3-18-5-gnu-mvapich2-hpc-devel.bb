SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mvapich2-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "465f98a7f31d3d1b02cb30c1b8621b6c8109a19683438a1a5672e4ad2eec0b5e792e2b3ddd9621dd378345ca62037c5124dc3a583301efa293c08c131e247061"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-mvapich2-hpc-devel petsc_3_18_5-gnu-mvapich2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/sh gnu-compilers-hpc-devel hdf5-gnu-mvapich2-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas-gnu-hpc-devel libpetsc_3_18_5-gnu-mvapich2-hpc libscalapack2-gnu-mvapich2-hpc-devel libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) mvapich2-gnu-hpc-devel"

inherit rpm
