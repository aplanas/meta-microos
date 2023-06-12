SUMMARY = "Macros for openMPI version 4.1.4"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.4."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-macros-devel-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "2d5721e9caab198e4373df2dfe1b2e535e668296a8634ddc0a6b7a1956895a622d2157f829e1664e89dbdf73cb146a03728df24fe4aafec4c0e687b7e9dc6226"

RPROVIDES:${PN} += "openmpi-macros-provider \
openmpi_4_1_4-gnu-hpc-macros-devel \
openmpi_4_1_4-gnu-hpc-macros-devel(aarch-64) \
rpm_macro(hpc_openmpi_init) \
rpm_macro(hpc_openmpi_requires) \
rpm_macro(hpc_openmpi_requires_devel) \
rpm_macro(hpc_setup_openmpi)"
RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc-devel"

inherit rpm
