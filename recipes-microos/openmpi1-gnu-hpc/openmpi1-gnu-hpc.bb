SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc provides the dependency to get binary package openmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "6bf4d64f85d8abd05715c06f4099c9268517d231fb313665d8fbf089afa321c3340523f9ed28cde7ebe0dbbd37ec7505b8e0bebbf01239bab2da8db5ebbf7b60"

RPROVIDES:${PN} += "openmpi1-gnu-hpc openmpi1-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh openmpi_1_10_7-gnu-hpc"

inherit rpm
