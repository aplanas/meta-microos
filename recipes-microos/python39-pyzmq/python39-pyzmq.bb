SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python39-pyzmq-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "e703780d540ed001b7bbc6e5b1fb0decdfdbc4f22850eb9c6d4b941f792ec97d3271f9c6c912436bb6eeb5939d8ac644c4ce92a2025bbfd2d40c61eba9e770ac"

RPROVIDES:${PN} += "python3.9dist(pyzmq) python39-pyzmq python39-pyzmq(aarch-64) python3dist(pyzmq)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libzmq.so.5()(64bit) python(abi)"

inherit rpm
