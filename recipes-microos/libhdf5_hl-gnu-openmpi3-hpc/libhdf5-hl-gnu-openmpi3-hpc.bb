SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "b06f9b2c6d291c79dcbaa864135158696ca6b8067dd94a0b82a3709177a12ee9a7e54712220274606bdb24ebb7b9f3103b6f292e92d4d7d64e84c949f234f631"

RPROVIDES:${PN} += "libhdf5_hl-gnu-openmpi3-hpc libhdf5_hl-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-openmpi3-hpc"

inherit rpm
