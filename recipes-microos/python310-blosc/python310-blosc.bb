SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python310-blosc-1.11.1-1.4.aarch64.rpm"
RPM_HASH = "88b3e977b955a282763ad4252f27b83c0fac1a645ef326e38b08379b8f31b48b08ed76813486df154332be68b45e4a9f4c494764bebc41abd17a0fba0ed7eb62"

RPROVIDES:${PN} += "python3-blosc \
python3.10dist(blosc) \
python310-blosc \
python310-blosc(aarch-64) \
python3dist(blosc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblosc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
