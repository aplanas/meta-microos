SUMMARY = "Static libraries for openMPI HPC version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-devel-static-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "c0e82daa6bcfd72777f9d25f8a2819cb7f5436057c2bec588a89c0c2cb42beb9352ac7a8c4aa3ae6eabd47914f5b220c7c91c1f9be6e9347ca0b8132d5db8bf8"

RPROVIDES:${PN} += "openmpi_2_1_6-gnu-hpc-devel-static openmpi_2_1_6-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "openmpi_2_1_6-gnu-hpc-devel"

inherit rpm
