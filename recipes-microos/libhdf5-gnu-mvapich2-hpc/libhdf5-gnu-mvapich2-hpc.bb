SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2ee70551e66b3b4dc768424a727cac01e913890bd990c8591bc11965e7e0356e4434c5adbff28b4d34eb91ffddd9773c4e92474617b6455b28eb506ea5f28966"

RPROVIDES:${PN} += "libhdf5-gnu-mvapich2-hpc libhdf5-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-mvapich2-hpc"

inherit rpm
