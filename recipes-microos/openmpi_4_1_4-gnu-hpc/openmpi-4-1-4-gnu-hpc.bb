SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
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
running Open MPI/OpenSHMEM version 4 jobs."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "9df0164e718ea97c35d9b79c8442af06b50c67cc8c39d89c8fa3e922ac5393372e2bdeb15dce89fadbf763367b7ecf203538dada88d00c1dbf403ba0cc5c7c11"

RPROVIDES:${PN} += "mpi \
openmpi_4_1_4-gnu-hpc \
openmpi_4_1_4-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libopenmpi_4_1_4-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
