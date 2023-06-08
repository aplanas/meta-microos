SUMMARY = "Documentation for Open MPI/SHMEM  version 3.1.6"
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
This subpackage provides the documentation for Open MPI/OpenSHMEM."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-docs-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "a42e7a5b9cd78f26cfeee768d16c704c5b40fc78665702621e233ef82a0c0615351ac3bfc80690448227d0cecbf745798284e8e7dd92a61cab065f70c09957c6"

RPROVIDES:${PN} += "openmpi3-docs openmpi3-docs(aarch-64)"
RDEPENDS:${PN} += "openmpi3"

inherit rpm
