SUMMARY = "Runtime configuration files for openMPI  version 1.10.7"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 1 or 2)."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-config-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "db4396ab1e33f8b3423cdfec4da4c45a4f49e975874e23964b433dd72cd27db02806d7a8fa9b4377d998e6000af8982e18b0508138459756c22ee4613df37b96"

RPROVIDES:${PN} += "config(openmpi1-config) openmpi-runtime-config openmpi1-config openmpi1-config(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
