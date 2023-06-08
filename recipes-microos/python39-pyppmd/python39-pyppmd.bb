SUMMARY = "PPMd compression/decompression library"
DESCRIPTION = "The pyppmd module provides classes and functions for compressing and \
decompressing text data, using PPM(Prediction by partial matching) \
compression algorithm which has several variations of implementations. \
PPMd is the implementation by Dmitry Shkarin. PyPPMD use Igor Pavlov's \
range coder introduced in 7-zip. \
 \
The API is similar to Python's bz2/lzma/zlib module. \
 \
Some parts of th codes are derived from 7-zip, pyzstd and ppmd-cffi."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "python39-pyppmd-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "43cf7d3df94670d707879c30e652a59b5c6e70a0290eec92f7ddc5a4751c5f3b9fb6e574e54995cb2cc93c4e96a334ffac690b3221e30fd2dc597be752fbab6e"

RPROVIDES:${PN} += "python3.9dist(pyppmd) python39-pyppmd python39-pyppmd(aarch-64) python3dist(pyppmd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi)"

inherit rpm
