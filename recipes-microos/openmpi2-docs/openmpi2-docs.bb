SUMMARY = "Documentation for Open MPI/SHMEM  version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "openmpi2-docs-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "7cd10897c123717cdf995b240aa1bed60c5f9f037c63a4304dfa4a25180a6c586bec9a3cfe6193a7b022ef96d40ebf24efc63248a1552d7afd3e0e9f6e88aaa5"

RPROVIDES:${PN} += "openmpi2-docs \
openmpi2-docs(aarch-64)"
RDEPENDS:${PN} += "openmpi2"

inherit rpm
