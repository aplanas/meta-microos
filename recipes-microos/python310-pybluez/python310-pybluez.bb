SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python310-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.8.aarch64.rpm"
RPM_HASH = "93fe01c22f8bedca8a2d496c19f6edac953ffb494593bc3fe0175e04ff1d2315c4daef2cdae89eaf92a13518f3750979b82b8ea1b25b7dc16be03790e453c634"

RPROVIDES:${PN} += "pybluez \
python3-pybluez \
python3.10dist(pybluez) \
python310-pybluez \
python310-pybluez(aarch-64) \
python3dist(pybluez)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
python(abi)"

inherit rpm
