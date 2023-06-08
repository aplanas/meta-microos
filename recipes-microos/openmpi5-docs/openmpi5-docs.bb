SUMMARY = "Documentation for Open MPI/SHMEM  version 5.0.0"
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

PV = "5.0.0"

RPM_NAME = "openmpi5-docs-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "08f6f3238c212c744193d8fc88cde838f91a2b72de76c0bf133bcc8674e2b77a1cfb51ccf61afdf927a1d403f17a5a246a16968ea0cc7e6f76668b4acb0ecc69"

RPROVIDES:${PN} += "openmpi5-docs openmpi5-docs(aarch-64)"
RDEPENDS:${PN} += "openmpi5"

inherit rpm
