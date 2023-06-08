SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi1-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi1-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "62984a10df7eff055a45ba7e23af75c315a640aad1f9a9e4656969bb6da00cf9af15a29b97ec0fb23635960c219077c9a496d8cc0ad333c4d689ee409509957f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi1-hpc"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi1-hpc"

inherit rpm
