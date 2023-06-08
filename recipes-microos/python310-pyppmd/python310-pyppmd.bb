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

RPM_NAME = "python310-pyppmd-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "605516a40193dcd6c6d6511a6296abe6613d956408c9cf4a59bfe9e84a0ea10ea960d4ac3dcf4cc1b0820194eb7203a8d666f0e0f3343a5fc39211eea5fa33ca"

RPROVIDES:${PN} += "python3-pyppmd python3.10dist(pyppmd) python310-pyppmd python310-pyppmd(aarch-64) python3dist(pyppmd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi)"

inherit rpm
