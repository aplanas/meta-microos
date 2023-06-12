SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ff8b2bd7abfa6e201729b306d430534c5dbe75efea0216aa307899bb27c6f38006edf7128c5ca744f1e126d743d4f4a5d01bec274c4f94581c2c244afedc66b9"

RPROVIDES:${PN} += "libhdf5_cpp-gnu-openmpi2-hpc \
libhdf5_cpp-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_cpp_1_12_2-gnu-openmpi2-hpc"

inherit rpm
