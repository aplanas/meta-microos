SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 4.1.4"
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

RPM_NAME = "openmpi4-libs-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "493a1d519a38426507ee1d07e04a4c44aa0de20939684583b263c192d4c6c119ebcdad812f4ff88f970c8dfca3bd01723894fc547259fc6fb181d56df09c7195"

RPROVIDES:${PN} += "libmca_common_dstore.so.1()(64bit) libmca_common_monitoring.so.50()(64bit) libmca_common_ofi.so.10()(64bit) libmca_common_ompio.so.41()(64bit) libmca_common_sm.so.40()(64bit) libmca_common_ucx.so.40()(64bit) libmca_common_verbs.so.40()(64bit) libmpi.so.40()(64bit) libmpi_mpifh.so.40()(64bit) libmpi_usempi_ignore_tkr.so.40()(64bit) libmpi_usempif08.so.40()(64bit) libompi_dbg_msgq.so()(64bit) libompitrace.so.40()(64bit) libopen-pal.so.40()(64bit) libopen-rte.so.40()(64bit) liboshmem.so.40()(64bit) openmpi-libs openmpi4-libs openmpi4-libs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevent_core-2.1.so.7()(64bit) libevent_pthreads-2.1.so.7()(64bit) libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.3)(64bit) libfabric.so.1(FABRIC_1.5)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) librdmacm.so.1()(64bit) librdmacm.so.1(RDMACM_1.0)(64bit) libucm.so.0()(64bit) libucp.so.0()(64bit) libucs.so.0()(64bit) openmpi4"

inherit rpm
