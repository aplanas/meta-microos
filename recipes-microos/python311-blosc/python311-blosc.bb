SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python311-blosc-1.11.1-1.4.aarch64.rpm"
RPM_HASH = "473900225225db3c6c50c59aaa3a8ccb9f34ea372ad5dc26d2c724f519eb6c2c9937f3e481978cc489fab67ac2c4504c63b538a1619e9e959cbbb6871acfefbf"

RPROVIDES:${PN} += "python3.11dist(blosc) \
python311-blosc \
python311-blosc(aarch-64) \
python3dist(blosc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblosc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
