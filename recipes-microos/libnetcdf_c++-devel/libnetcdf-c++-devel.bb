SUMMARY = "Development files for netcdf_c++"
DESCRIPTION = "This package contains the netcdf_c++ header files and shared devel libs. \
It's not recommended for new projects, but it still works."
LICENSE = "NetCDF"

PV = "4.2"

RPM_NAME = "libnetcdf_c++-devel-4.2-8.31.aarch64.rpm"
RPM_HASH = "f295c4207206a7114488732524dc28f636f1f83e4eb02adb7eecaa03b55a6dc0e98c7cfa8c374a0d12d9fbc49942329eac443e87f61ff7289dd0382cbb78e9bb"

RPROVIDES:${PN} += "libnetcdf-devel:/usr/lib64/libnetcdf_c++.so libnetcdf_c++-devel libnetcdf_c++-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libnetcdf_c++4"

inherit rpm
