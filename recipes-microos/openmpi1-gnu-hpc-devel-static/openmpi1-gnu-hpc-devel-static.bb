SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel-static provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-static-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "6e18f247c6e6d6f94ee96b4e1ec4fb1a34ab0e5d57f4b9b037419e2867b34417aa21f917e12b7ad70866664c9fe0c2c787d10f61a49929d63e4f5a53410d1e24"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel-static openmpi1-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "openmpi_1_10_7-gnu-hpc-devel-static"

inherit rpm
