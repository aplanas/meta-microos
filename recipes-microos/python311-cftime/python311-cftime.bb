SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-cftime-1.6.2-1.5.aarch64.rpm"
RPM_HASH = "e3617c6d31ac84c0a328a51a11232b7720ee9b6d1f81d45741f8bc773f53a6f9ea622cba9387140d59b7f24ecee954fe30f33f78f64e2d2a20e9b7cace10b645"

RPROVIDES:${PN} += "python3.11dist(cftime) \
python311-cftime \
python311-cftime(aarch-64) \
python3dist(cftime)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-Cython \
python311-numpy"

inherit rpm
