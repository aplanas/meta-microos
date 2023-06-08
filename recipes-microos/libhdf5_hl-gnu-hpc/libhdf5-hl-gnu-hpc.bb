SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2f5e5fd1290077957f70681388684efeac702ea26d95c889d0d6c12e58aef383d5fd673035eb9dadcf94eddd0208215d5202c1fa634ee67097f3ccc9489f3e62"

RPROVIDES:${PN} += "libhdf5_hl-gnu-hpc libhdf5_hl-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-hpc"

inherit rpm
