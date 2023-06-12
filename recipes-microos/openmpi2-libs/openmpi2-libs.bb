SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
OpenMPI also includes an implementation of the OpenSHMEM parallel \
programming API, which is a Partitioned Global Address Space (PGAS) \
abstraction layer providing inter-process communication using \
one-sided communication techniques. \
 \
This subpackage provides the OpenMPI shared libraries."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-libs-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "8c5081fdcaa675ee1f7583c3a118058438bf118aa0aa09de47b645f4f88e909d0c53660e229bfa8a359acb5a6271891a50e87e34c008e8731102bcf472535a6a"

RPROVIDES:${PN} += "libmca_common_sm.so.20()(64bit) \
libmca_common_verbs.so.20()(64bit) \
libmpi.so.20()(64bit) \
libmpi_mpifh.so.20()(64bit) \
libmpi_usempi_ignore_tkr.so.20()(64bit) \
libmpi_usempif08.so.20()(64bit) \
libompi_dbg_msgq.so()(64bit) \
libompitrace.so.20()(64bit) \
libopen-pal.so.20()(64bit) \
libopen-rte.so.20()(64bit) \
liboshmem.so.20()(64bit) \
openmpi2-libs \
openmpi2-libs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
libucp.so.0()(64bit) \
openmpi2"

inherit rpm
