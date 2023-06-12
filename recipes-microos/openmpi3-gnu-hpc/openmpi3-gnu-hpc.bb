SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc provides the dependency to get binary package openmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "f2b03df8448d51fc210cbc45011cc260b1e6ad134ea9cd49d9061eb05ab3c887b866e7c6cc4b5fd2dd4f6ec9683ec10bfc546e3304b5df7446e5cba1f3b1bcbb"

RPROVIDES:${PN} += "openmpi3-gnu-hpc \
openmpi3-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
openmpi_3_1_6-gnu-hpc"

inherit rpm
