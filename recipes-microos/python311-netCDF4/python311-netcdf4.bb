SUMMARY = "Python interface to netCDF 3 and 4"
DESCRIPTION = "netCDF version 4 has many features not found in earlier versions of \
the library and is implemented on  top of HDF5. This module can read \
and write files in both the new netCDF 4 and the old netCDF 3 \
format, and can create files that are readable by HDF5 clients. The \
API modelled after Scientific.IO.NetCDF, and should be familiar to \
users of that module. \
 \
Most new features of netCDF 4 are implemented, such as multiple unlimited \
dimensions, groups and zlib data compression. All the new numeric data types \
(such as 64 bit and unsigned integer types) are implemented. Compound and \
variable length (vlen) data types are supported, but the enum and opaque data \
types are not. Mixtures of compound and vlen data types (compound types \
containing vlens, and vlens containing compound types) are not supported."
LICENSE = "HPND & MIT"

PV = "1.6.2"

RPM_NAME = "python311-netCDF4-1.6.2-1.5.aarch64.rpm"
RPM_HASH = "208c12982f4c57a6324758367ad2a011c7381ce2658f3bd7184e65691c46d93ea613a98354b2e60e91aab96c486ae1841bb324d14cb8de5c005614549ea6bf35"

RPROVIDES:${PN} += "python3.11dist(netcdf4) python311-netCDF4 python311-netCDF4(aarch-64) python3dist(netcdf4)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 hdf5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnetcdf.so.19()(64bit) netcdf python(abi) python311-cftime python311-numpy update-alternatives"

inherit rpm
