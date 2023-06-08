SUMMARY = "Python wrapper for the C-Blosc2 library"
DESCRIPTION = "Blosc (https://blosc.org) is a high performance compressor optimized \
for binary data. It has been designed to transmit data to the processor \
cache faster than the traditional, non-compressed, direct memory fetch \
approach via a memcpy() OS call. \
 \
Blosc works well for compressing numerical arrays that contains data \
with relatively low entropy, like sparse data, time series, grids with \
regular-spaced values, etc. \
 \
python-blosc2 is a Python package that wraps C-Blosc2, the newest version \
of the Blosc compressor. Currently python-blosc2 already reproduces the \
API of python-blosc, so the former can be used as a drop-in replacement \
for the later."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-blosc2-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "94be829bd2dec5d254b194dd50fd015be087e7976c5843bb5d3ac5db73c1180318547ade01722742063b409071ce26ce9a97b70d89fa0f7660085e869361fb3c"

RPROVIDES:${PN} += "python3.9dist(blosc2) python39-blosc2 python39-blosc2(aarch-64) python3dist(blosc2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblosc2.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-msgpack python39-ndindex python39-numpy python39-py-cpuinfo python39-rich"

inherit rpm
