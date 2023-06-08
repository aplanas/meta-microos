SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python39-pyzmq-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "6198971e4c625effcf031ed0573479ca2d7acb18e106f415cf1b77d11f10fa3ef8655b368f9ad5f65a6bc429aeda45ec30588787aec6bf23ad2345d4b55fdf1e"

RPROVIDES:${PN} += "python3.9dist(pyzmq) python39-pyzmq python39-pyzmq(aarch-64) python3dist(pyzmq)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libzmq.so.5()(64bit) python(abi)"

inherit rpm
