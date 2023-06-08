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

RPM_NAME = "python311-pyppmd-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "e5c13c4911e26d59f73431728a7dd5a331e5e602a5411e24e1a22c120ec12470f0100f0b7acf502cbad5b0f8933558a8f4e64cc6fefc0946952799021c1e7048"

RPROVIDES:${PN} += "python3.11dist(pyppmd) python311-pyppmd python311-pyppmd(aarch-64) python3dist(pyppmd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi)"

inherit rpm
