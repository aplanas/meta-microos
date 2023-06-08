SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-mpich-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "918b1b82640683468f84f1fb989990a9314f2e44dac39af4e6fab708af22dea688546afc2bb3b12a42288ba05209c2bb9d77a156c489e53ed188686ce9cee820"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-mpich-hpc libhdf5_fortran-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-mpich-hpc"

inherit rpm
