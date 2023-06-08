SUMMARY = "Macros for openMPI version 4.1.4"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.4."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-macros-devel-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "5c7571c530bb4e4c21dc67d84bf8f5bf7ddfadd3f252a2e49ffc365db52ca09968b9b00e4dd50e0e50f8516686b667b8ae4b775c7cc392bf534b354630814ec4"

RPROVIDES:${PN} += "openmpi-macros-devel openmpi-macros-provider openmpi4-macros-devel openmpi4-macros-devel(aarch-64) rpm_macro(openmpi_devel_requires) rpm_macro(openmpi_prefix) rpm_macro(openmpi_requires) rpm_macro(setup_openmpi)"
RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
