SUMMARY = "Documentation for Open MPI/SHMEM  version 1.10.7"
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

PV = "1.10.7"

RPM_NAME = "openmpi1-docs-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "64e43a06698fbf3ad38ff89a67cb3b7b3b8b85de9f814e3b71062570b8b2d03ddd5f18fd93b52dde636676bb1295372234a52fb71d64aa80489a361ca9d5b03a"

RPROVIDES:${PN} += "openmpi1-docs \
openmpi1-docs(aarch-64)"
RDEPENDS:${PN} += "openmpi1"

inherit rpm
