SUMMARY = "Development data files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains generic files needed to create projects that use \
any version of NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-data-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "36e25c6b77a1b38ff18f858e92fab5ae00a72defa219eced1be5bd7dd631c9fde5dbf0a27ac5a2861fe0cf8e99d632fe79d61da70b9733c92cb6921fb7a344f5"

RPROVIDES:${PN} += "netcdf-devel-data netcdf-devel-data(aarch-64) netcdf-rpm-macros rpm_macro(_netcdf_sonum) rpm_macro(_netcdf_version)"
RDEPENDS:${PN} += ""

inherit rpm
