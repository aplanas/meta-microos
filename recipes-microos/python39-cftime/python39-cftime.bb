SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-cftime-1.6.2-1.5.aarch64.rpm"
RPM_HASH = "f0dbf51be3f748a07e50988b9dd50bc2ad7344c6a3342cff5c7a4bb4a3579ef9bc345370b3a0b5d00ac3406ef944b4e48bf5511a809c2259ad1a4ea9e5401048"

RPROVIDES:${PN} += "python3.9dist(cftime) \
python39-cftime \
python39-cftime(aarch-64) \
python3dist(cftime)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-Cython \
python39-numpy"

inherit rpm
