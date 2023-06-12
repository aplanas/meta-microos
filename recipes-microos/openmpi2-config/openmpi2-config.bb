SUMMARY = "Runtime configuration files for openMPI  version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 1 or 2)."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-config-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "a1bc33df9505e196e65fbee9a784bbdd3fcffe3177b3a1d9f55cb746760055f5a9cde38e525046855a86f1d136faf6098e5e381b7c08c20a148cef5700261279"

RPROVIDES:${PN} += "config(openmpi2-config) \
openmpi-runtime-config \
openmpi2-config \
openmpi2-config(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
