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

RPM_NAME = "python310-netCDF4-1.6.2-1.5.aarch64.rpm"
RPM_HASH = "30db24318ccd0da47e25ffd9deceb90f406d32145fe559e26af454ce5de45843226b34da07da6c27ecb23476343eaf4dee041807a59a6c3a197ebf17b6321d18"

RPROVIDES:${PN} += "python3-netCDF4 python3.10dist(netcdf4) python310-netCDF4 python310-netCDF4(aarch-64) python3dist(netcdf4)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 hdf5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnetcdf.so.19()(64bit) netcdf python(abi) python310-cftime python310-numpy update-alternatives"

inherit rpm
