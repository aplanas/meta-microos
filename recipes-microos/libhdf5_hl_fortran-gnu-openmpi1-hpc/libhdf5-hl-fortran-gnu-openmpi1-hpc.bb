SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "395bfcf2d33b2d4c09ffe4e6f645671fce4b0bfac141e6101ef4ca124ab0c96e6e931759299f9dac2a9ecc2daa31f91b01917afea810c0d846f5ff4626c25b9f"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-openmpi1-hpc libhdf5_hl_fortran-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc"

inherit rpm
