SUMMARY = "Drop-in replacement for Python's int and float"
DESCRIPTION = "fastnumbers is a Python module with three objectives: \
 \
1. To provide drop-in replacements for the Python built-in `int` and \
   `float` that, on average, are around 2x faster. These functions \
   should behave identically to the Python built-ins except for a few \
   specific corner-cases as mentioned in the API documentation. \
2. To provide a set of convenience functions that wrap the above int \
   and float replacements and provide error handling. \
3. To provide a set of functions that can be used to identify whether \
   an input could be converted to int or float."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-fastnumbers-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "90ac52903fa6e56e37bde0b4b9f76a6016d473868df1b0773ab5ed7302f1107c27487f1fe997c5c76dec2af9ac659058f01d47a65ced0bcd9010e095aa23d213"

RPROVIDES:${PN} += "python3-fastnumbers \
python3.10dist(fastnumbers) \
python310-fastnumbers \
python310-fastnumbers(aarch-64) \
python3dist(fastnumbers)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
