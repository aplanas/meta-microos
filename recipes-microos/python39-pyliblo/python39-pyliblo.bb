SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python39-pyliblo-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "a1ed9334a4675ba72a7e0b4f4950a51ca5697c03066639103c1f20db26869b46bab5189a38b5389c53e614cfe0f10f7bd8d9e23796630f486a54377832004779"

RPROVIDES:${PN} += "liblo.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(pyliblo) \
python39-pyliblo \
python39-pyliblo(aarch-64) \
python3dist(pyliblo)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblo.so.7()(64bit) \
python(abi)"

inherit rpm
