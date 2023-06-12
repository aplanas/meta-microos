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

RPM_NAME = "python311-fastnumbers-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "7bee08fda0fced261b0a5e3a93a97e4039da902e566a3bf3ef8095dd3b515822a267e75c872225b4b682a8a4d61bd5bfab0ca4fd7c9127d3b54a91732332f82d"

RPROVIDES:${PN} += "python3.11dist(fastnumbers) \
python311-fastnumbers \
python311-fastnumbers(aarch-64) \
python3dist(fastnumbers)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
