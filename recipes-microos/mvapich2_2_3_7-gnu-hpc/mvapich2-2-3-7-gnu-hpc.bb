SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "98cefca805eb900d5753a2a4a1a7329f19aa57c37adc4741b8c27a429fa0c76c0e1c22fea52775195dddceaeb691b20be6921edb6c20e3a83670ec0d62ab8611"

RPROVIDES:${PN} += "mvapich2_2_3_7-gnu-hpc \
mvapich2_2_3_7-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libhwloc.so.15()(64bit) \
libibmad.so.5()(64bit) \
libibmad.so.5(IBMAD_1.3)(64bit) \
libibumad.so.3()(64bit) \
libibumad.so.3(IBUMAD_1.0)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
libpciaccess.so.0()(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
lua-lmod"

inherit rpm
