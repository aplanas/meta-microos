SUMMARY = "Python bindings for the liblo Open Sound Control (OSC) library"
DESCRIPTION = "pyliblo is a Python wrapper for the liblo OSC library. \
It supports almost the complete functionality of liblo, \
allowing you to send and receive OSC messages using a nice and simple Python API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "bb40f6f09b9aae64f7453723376213c0f74a32adda301c95a21093273e22d4d3078bd5698397e1dc90dc6bf8df162cffb1e5c6be74f4957cbe9f196111a556b5"

RPROVIDES:${PN} += "liblo.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(pyliblo) \
python311-pyliblo \
python311-pyliblo(aarch-64) \
python3dist(pyliblo)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblo.so.7()(64bit) \
python(abi)"

inherit rpm
