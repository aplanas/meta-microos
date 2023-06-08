SUMMARY = "Dependency package for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "pnetcdf: High-performance parallel I/O with the NetCDF scientific data format \
The package pnetcdf-gnu-openmpi2-hpc provides the dependency to get binary package pnetcdf_1_12_3-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of pnetcdf_1_12_3-gnu-openmpi2-hpc."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-gnu-openmpi2-hpc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "4879a8c3dc77da9c79758abcf4646facdb106d1c7cb95f3ed9903f5812d7db1e66e287bbd2c0610c4f7be3260bcacbcd52ab9596102bfbef98f4b2159893bc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-gnu-openmpi2-hpc"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi2-hpc"

inherit rpm
