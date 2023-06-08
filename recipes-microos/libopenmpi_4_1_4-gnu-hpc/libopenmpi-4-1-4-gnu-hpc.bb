SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 4.1.4"
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
This package provides the Open MPI/OpenSHMEM version 4 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "libopenmpi_4_1_4-gnu-hpc-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "4263de5e87e7d12440a014e39e2681637aa74e157fafe3e7be84b201214bf59deb294acd6649cb7671ad4bd5f125e8d72447f02f3ac186b2244015f2423dd174"

RPROVIDES:${PN} += "libopenmpi_4_1_4-gnu-hpc libopenmpi_4_1_4-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevent_core-2.1.so.7()(64bit) libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.3)(64bit) libfabric.so.1(FABRIC_1.5)(64bit) libhwloc.so.15()(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpmix.so.2()(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) libucp.so.0()(64bit) libucs.so.0()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) lua-lmod openmpi_4_1_4-gnu-hpc"

inherit rpm
