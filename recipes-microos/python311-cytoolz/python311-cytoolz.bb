SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-cytoolz-0.12.1-1.4.aarch64.rpm"
RPM_HASH = "ba7f83d444a8b7888a3e15df7f642a2d110962d0195ad1cad4cc125b66fc460db9c067eda5b486d5f7b4b2f23302279f08fe1d24085fc7f8cd54f00d4e4a00c4"

RPROVIDES:${PN} += "python3.11dist(cytoolz) \
python311-cytoolz \
python311-cytoolz(aarch-64) \
python3dist(cytoolz)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-toolz"

inherit rpm
