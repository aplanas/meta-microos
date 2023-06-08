SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "68bbd5c11c43bd0f0e05662b9b919a77600b4ad6081fd2c999469db04d6de34a093c1416115ff4718321652426542e39d43f310a1cd617bc84bed578da90890d"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-mvapich2-hpc libhdf5_fortran-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-mvapich2-hpc"

inherit rpm
