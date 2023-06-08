SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ad7c3a43c6a7ad4fd05229607c3b1937a64438dff23b3dfddf2dc5361cb3be81c83259dfb4788e64ffc368565619bc3797a14920791d4b82a0c0def355c0f777"

RPROVIDES:${PN} += "libhdf5_cpp-gnu-hpc libhdf5_cpp-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_cpp_1_12_2-gnu-hpc"

inherit rpm
