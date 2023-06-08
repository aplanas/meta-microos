SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi3-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "bdda990941979749aac33fd9f082970c60e7392d3c5a43d5732944880ff80bb631cf41afb87b41e738f3adaf6cdd52f1d2b4cee0420b53bc715ca3cf7a5d125b"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-openmpi3-hpc-devel petsc_3_18_5-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/sh gnu-compilers-hpc-devel hdf5-gnu-openmpi3-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas-gnu-hpc-devel libpetsc_3_18_5-gnu-openmpi3-hpc libscalapack2-gnu-openmpi3-hpc-devel libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) openmpi3-gnu-hpc-devel"

inherit rpm
