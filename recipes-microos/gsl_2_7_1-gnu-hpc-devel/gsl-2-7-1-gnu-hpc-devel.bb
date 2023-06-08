SUMMARY = "Development files for the GNU Scientific Library"
DESCRIPTION = "This package contains the headers, static libraries and some \
documentation for GSL. \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-devel-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "ae98fe6d13071ad4e387622d2ae054c15046318bb61efae686c834d369678cfd7a04f8676a326c52bce035c88f6999099bee20a72f762d9496b64811c7229236"

RPROVIDES:${PN} += "gsl_2_7_1-gnu-hpc-devel gsl_2_7_1-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgsl_2_7_1-gnu-hpc libgslcblas_2_7_1-gnu-hpc libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
