SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "23b1179c675453e08989f4aaa72540c0967d08c5c368be7d247c0b389bba0bc423ef88116ed401746e2a919b7b71a21415a3b9ad0912762637d0a8d77974ad7e"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi3-hpc libhdf5-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-openmpi3-hpc"

inherit rpm
