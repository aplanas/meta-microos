SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-cytoolz-0.12.1-1.4.aarch64.rpm"
RPM_HASH = "1604116bc755a9ff7980b7561bb3eca5bd5cbd124232f39f2b838ed117767bcff0b3af777c2964b3bcfa151ab7cc879ed71d8b4b99d33fb723a4aadd78514799"

RPROVIDES:${PN} += "python3.9dist(cytoolz) \
python39-cytoolz \
python39-cytoolz(aarch-64) \
python3dist(cytoolz)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-toolz"

inherit rpm
