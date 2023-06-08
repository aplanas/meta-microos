SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "7a0042d13b3fce75aa29819f0c8857b83550e355af98d21b01645c2518ac5f528760a5ba518c16affbdac9e87a6240fc941a4851952e9e3dbbb731c5e686aa94"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-mvapich2-hpc libhdf5_hl_fortran-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc"

inherit rpm
