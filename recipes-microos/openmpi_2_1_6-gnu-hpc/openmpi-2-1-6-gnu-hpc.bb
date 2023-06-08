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

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "082e1015c18b16ff100336bf9ebc5b7b305a8c5f813d46987a66123ce98b7e0aa1b35563f4cb933f7b7cc7165e7b20dff7dfea410bfd88e62b75fed754f5406e"

RPROVIDES:${PN} += "mpi openmpi_2_1_6-gnu-hpc openmpi_2_1_6-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenmpi_2_1_6-gnu-hpc lua-lmod openmpi-runtime-config openssh"

inherit rpm
