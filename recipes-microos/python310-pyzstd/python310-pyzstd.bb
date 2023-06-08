SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python310-pyzstd-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "df61764a1f6f8aa99668bbafa73fb0dee48c3df5d6153aa681e02a80cae3e55646cfe058b86577fa7fe103c1bbb7ac7935155c156692cbd676fe4e234bb3d915"

RPROVIDES:${PN} += "python3-pyzstd python3.10dist(pyzstd) python310-pyzstd python310-pyzstd(aarch-64) python3dist(pyzstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzstd.so.1()(64bit) python(abi)"

inherit rpm
