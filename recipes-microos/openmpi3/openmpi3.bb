SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
 \
 \
 \
OpenMPI is an implementation of the Message Passing Interface, a \
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
This package provides general tools (mpirun, mpiexec, etc.) and the \
Module Component Architecture (MCA) base and plugins necessary for \
running Open MPI/OpenSHMEM jobs."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "75a1f90fbe56a70572ab2ade0c0604a0466f808371df9470272a02916525472747e2fd0b087b72f48f25b50e570605b7d481cb0ef49571f3b7f18156c1b16e85"

RPROVIDES:${PN} += "mpi \
openmpi3 \
openmpi3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent-2.1.so.7()(64bit) \
libmpi.so.40()(64bit) \
libopen-pal.so.40()(64bit) \
libopen-rte.so.40()(64bit) \
liboshmem.so.40()(64bit) \
mpi-selector \
openmpi-runtime-config \
openmpi3-libs \
openssh"

inherit rpm
