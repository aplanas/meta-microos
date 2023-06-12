SUMMARY = "Dependency package for libpnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package libpnetcdf-gnu-openmpi3-hpc provides the dependency to get binary package libpnetcdf_1_12_3-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi3-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "libpnetcdf-gnu-openmpi3-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "1ce5cbbca50540fc0dcd0939439a399387384533411cbf92d2c7bbe5aa4d8b1e6cbf77b4b51a02d857061a9200fe1e6940847a5937769fc12a9e9a8559e37735"

RPROVIDES:${PN} += "libpnetcdf-gnu-openmpi3-hpc \
libpnetcdf-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libpnetcdf_1_12_3-gnu-openmpi3-hpc"

inherit rpm
