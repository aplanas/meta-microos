SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-mpich-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "c504ddfe22a6a56847166f06d53fc7ff3889486dd14de8e28ea3ef653192d599132d5fd96136fe0b53a17f1f5519c0f1174fff00b10e15b9b2c3a942529b1d9d"

RPROVIDES:${PN} += "libhdf5_hl_cpp-gnu-mpich-hpc libhdf5_hl_cpp-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc"

inherit rpm
