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

RPM_NAME = "python311-blosc2-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "48bcd759919c5cf5c12f643c0bfe1773e14cf42016bd0f2f05de7bdc739def36c4ea84891326bb6907967b9519c17fb95c949b0cc45df1c938a7a44ff3f19a99"

RPROVIDES:${PN} += "python3.11dist(blosc2) python311-blosc2 python311-blosc2(aarch-64) python3dist(blosc2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblosc2.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-msgpack python311-ndindex python311-numpy python311-py-cpuinfo python311-rich"

inherit rpm
