SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python39-pyzstd-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "70504890461520b8f1e5d802e474db3ff7b7fd584520e829457d7253f6e2bf3afa26c9b69cbb08e84b34919889c284afd73ca884e3e91c46fdeab45fa5bd9e02"

RPROVIDES:${PN} += "python3.9dist(pyzstd) \
python39-pyzstd \
python39-pyzstd(aarch-64) \
python3dist(pyzstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzstd.so.1()(64bit) \
python(abi)"

inherit rpm
