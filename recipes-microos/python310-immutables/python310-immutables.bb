SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python310-immutables-0.19-2.1.aarch64.rpm"
RPM_HASH = "e4923b46978207d54473f6413088982a7f9a841627f83fb7c142d81138a726845ea2be78657d51371e503277be6376d78314aaeddfda2b70376faa7d72f09c72"

RPROVIDES:${PN} += "python3-immutables \
python3.10dist(immutables) \
python310-immutables \
python310-immutables(aarch-64) \
python3dist(immutables)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
