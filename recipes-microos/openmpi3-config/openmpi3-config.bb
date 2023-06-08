SUMMARY = "Runtime configuration files for openMPI  version 3.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-config-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "1b4a7bc32d774e6ad8c7c96e938d7e61abb46da925667275794473a35f77d714987e5b2e5eca42547e9112a5494f4055ffa1988b93c5a1617e221eb0a55c7836"

RPROVIDES:${PN} += "config(openmpi3-config) openmpi-runtime-config openmpi3-config openmpi3-config(aarch-64) pmix-runtime-config"
RDEPENDS:${PN} += ""

inherit rpm
