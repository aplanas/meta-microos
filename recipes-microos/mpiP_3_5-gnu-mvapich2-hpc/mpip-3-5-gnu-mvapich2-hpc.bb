SUMMARY = "A profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
It only collects statistical information about MPI functions, so mpiP \
generates less overhead and much less data than tracing \
tools. All the information captured by mpiP is task-local. It only \
uses communication during report generation, typically at the end of \
the experiment, to merge results from all of the tasks into one output \
file."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "3e9f834a38a9c6d88612ed667a13a3c58f4f99621c84d8f64e7fe53ee4862d6edc66edee3e90ef614aeac86210b4efb1bd750542b622ae487bdfc6356418d8d3"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mvapich2-hpc mpiP_3_5-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libunwind.so.8()(64bit) lua-lmod mvapich2-gnu-hpc"

inherit rpm
