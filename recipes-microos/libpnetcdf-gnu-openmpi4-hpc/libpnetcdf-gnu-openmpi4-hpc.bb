SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi4-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi4-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi4-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "82ca2544b69d9940d926871db20434c7a26736dffbd10b22cdcfff952f2b4b5238ad9c3cd894e0829e593891859fe31947d7038d1839b3ddf43abd589652527a"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi4-hpc libpnetcdf-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libpnetcdf_1_12_3-gnu-openmpi4-hpc"

inherit rpm
