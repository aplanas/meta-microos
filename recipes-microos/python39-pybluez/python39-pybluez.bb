SUMMARY = "A Python Bluetooth wrapper"
DESCRIPTION = "PyBluez is an effort to create python wrappers around system Bluetooth \
resources to allow Python developers to easily and quickly create \
Bluetooth applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.23+git5096047f90a1f6a74ceb250aef6243e144170f92"

RPM_NAME = "python39-pybluez-0.23+git5096047f90a1f6a74ceb250aef6243e144170f92-1.8.aarch64.rpm"
RPM_HASH = "56c57a9695dfb37d0221f9a25af11561ca4560693c618dedd0acc9f30d969897734f58d46147379463cbac016639c1cc58e7b559b08b13abf8a48fcf107ac234"

RPROVIDES:${PN} += "pybluez python3.9dist(pybluez) python39-pybluez python39-pybluez(aarch-64) python3dist(pybluez)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.28)(64bit) python(abi)"

inherit rpm
