SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi2-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi2-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "b09757132c9d501e98e085cddbea03a35569e509bf86ebdeb0b60261583a48e4bf3ab9f7cdf3e6f4493a2db24fd04dad92678099d2405fdaf5486c75bd26b522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi2-hpc-devel"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi2-hpc-devel"

inherit rpm
