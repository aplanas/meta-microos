SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f1ac7c66fdd6d6b72189bab96a03fa60e7d25d0482560d7852a658bf5f0ae90568f519c36e116ecb1f0b8a97531412d77982f159a594f5c968699132cb7ae06f"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-hpc \
libhdf5_fortran-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-hpc"

inherit rpm
