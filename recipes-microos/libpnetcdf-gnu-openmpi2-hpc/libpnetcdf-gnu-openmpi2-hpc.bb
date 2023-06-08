SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi2-hpc-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "04ee8482c0ea98d99f7fb1c6a0616e5522341524677091ee420dac822a384dd151112577b058377523af9b00834245405815aa81045f953518431000ba39ef9f"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi2-hpc libpnetcdf-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libpnetcdf_1_12_3-gnu-openmpi2-hpc"

inherit rpm
