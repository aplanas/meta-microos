SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "6d369e544a11a2fa36a71e979b9b266cda134d2fd371cd71a28be8b4ca3bee434ee19cff3da77a459eef9738b93250936e2a7d5d4b1544b742a44128db5055c2"

RPROVIDES:${PN} += "gsl_2_7_1-gnu-hpc gsl_2_7_1-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgsl_2_7_1-gnu-hpc"

inherit rpm
