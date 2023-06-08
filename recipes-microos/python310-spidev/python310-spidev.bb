SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python310-spidev-3.6-1.4.aarch64.rpm"
RPM_HASH = "0d2c9e0e8d64795b80643a02656acf2ba2d2216383128e38cf87a01ee0b7f88bda1a544e95ce38e34398f63e2e2b82c0ce71fa4ab3f8ba01c9c354921d9f50d9"

RPROVIDES:${PN} += "python3-spidev python3.10dist(spidev) python310-spidev python310-spidev(aarch-64) python3dist(spidev)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
