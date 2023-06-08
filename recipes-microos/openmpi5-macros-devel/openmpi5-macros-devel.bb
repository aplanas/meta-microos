SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-macros-devel-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "7f5c7782c62180a848541f09e42f6bf5b6c99df8b585bfab91f9413922406863d740a585eeddb22d0be1b4b515b4d2e7b237edb21d802f2ec446c9763092c326"

RPROVIDES:${PN} += "openmpi-macros-provider openmpi5-macros-devel openmpi5-macros-devel(aarch-64) rpm_macro(openmpi_devel_requires) rpm_macro(openmpi_prefix) rpm_macro(openmpi_requires) rpm_macro(setup_openmpi)"
RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
