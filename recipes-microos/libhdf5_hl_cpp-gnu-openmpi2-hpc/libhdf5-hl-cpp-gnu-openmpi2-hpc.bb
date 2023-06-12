SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "3a81cfb817ad9b3c05a3550f5b089b556adbf8fba394a9bb7d1492ff0ca42d642798e47edf31e478c2425c3f709e2be6947cc63d0006338a749d6b11b20b8ff1"

RPROVIDES:${PN} += "libhdf5_hl_cpp-gnu-openmpi2-hpc \
libhdf5_hl_cpp-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc"

inherit rpm
