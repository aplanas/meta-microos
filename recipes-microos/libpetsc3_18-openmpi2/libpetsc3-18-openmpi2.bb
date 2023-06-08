SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi2-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "df7b68d8f0a80c601e9f3017036e884af4a9b7ac2d8d5053bd0e4c980334d70d9ec631a57af07c04910e769be747b8751a3091fe137a4a3c44e8c1c48cca515d"

RPROVIDES:${PN} += "libpetsc.so.3.18()(64bit) libpetsc3_18-openmpi2 libpetsc3_18-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libamd.so.2()(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcholmod.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libhdf5.so.200()(64bit) libklu.so.1()(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.20()(64bit) libmpi_mpifh.so.20()(64bit) libptscotch.so.0()(64bit) libptscotcherrexit.so.0()(64bit) libptscotchparmetis.so.0()(64bit) libscalapack.so.2.1.0()(64bit) libspqr.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libumfpack.so.5()(64bit)"

inherit rpm
