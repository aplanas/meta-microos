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

RPM_NAME = "python310-blosc2-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "3a6aca1a27cf6194456647ebba4d096b21a6eb99433a1e7b9d3e32e432312456f245606948a7a2c83e9901d960eafc81d10747eae919d0d399c61f095008ab74"

RPROVIDES:${PN} += "python3-blosc2 python3.10dist(blosc2) python310-blosc2 python310-blosc2(aarch-64) python3dist(blosc2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblosc2.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-msgpack python310-ndindex python310-numpy python310-py-cpuinfo python310-rich"

inherit rpm
