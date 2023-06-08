SUMMARY = "SDK for openMPI  version 5.0.0"
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
This package provides the development files for Open MPI/OpenSHMEM \
version 5, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-devel-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "418b4c05ef9084a9e231c5f2f9b3f9a79685650159fa02048c0b10dfb9ff65d078b44bc8774198b5f2d67f5e80b5add8e260c2f4f8dd23f97e20ccbe2c9b80e4"

RPROVIDES:${PN} += "openmpi5-devel openmpi5-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibumad-devel libibverbs-devel libopen-pal.so.80()(64bit) libstdc++-devel openmpi5"

inherit rpm
