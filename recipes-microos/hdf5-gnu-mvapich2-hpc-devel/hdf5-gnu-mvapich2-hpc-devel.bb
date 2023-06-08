SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mvapich2-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mvapich2-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "f6bd3e983f6bbbe0802aab2391e0262f6fe9443b422d2bae468552349745a290927df96a4634a0e6d0a3d7004fa32b80b437f40f0d6ef22d7dfa689b8e27d8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mvapich2-hpc-devel"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mvapich2-hpc-devel"

inherit rpm
