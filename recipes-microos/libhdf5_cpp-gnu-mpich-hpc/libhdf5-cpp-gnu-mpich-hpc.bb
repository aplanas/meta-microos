SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-mpich-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "57ab778f901912e54ff0ac4da690a50c1e92b00f531babce803339c59d49455200a35e1220d70366610c1b35cdbb87a46412272eaf5455a40c3577375089ead0"

RPROVIDES:${PN} += "libhdf5_cpp-gnu-mpich-hpc libhdf5_cpp-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_cpp_1_12_2-gnu-mpich-hpc"

inherit rpm
