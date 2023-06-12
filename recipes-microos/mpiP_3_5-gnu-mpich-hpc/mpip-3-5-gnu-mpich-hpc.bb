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

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "496df76780faca4683c920a3d4016d0ef41a6fa3ebffb392a80371ebd75783648c0fd764fe7234764b510b7de7c28f3ff8025a80189e7fed5165960db3fa9cfe"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mpich-hpc \
mpiP_3_5-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libunwind.so.8()(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
