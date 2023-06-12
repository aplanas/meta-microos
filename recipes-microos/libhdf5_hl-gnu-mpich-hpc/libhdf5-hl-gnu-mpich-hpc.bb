SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-mpich-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b700a96286c59e79caa9672dad07873c57a7cf9a3eaec1eab79cdf0ce1835004e27d4846d92d35c6315d4b35dea3c79f680ac3ff45bed80d3c80b5a080059c32"

RPROVIDES:${PN} += "libhdf5_hl-gnu-mpich-hpc \
libhdf5_hl-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-mpich-hpc"

inherit rpm
