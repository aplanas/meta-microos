SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python310-pyzmq-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "f2f734bfb0f4d82967156439c304cf0fdb4ddf9743e53a60fc116e775069f8691a254b743c49e447bb2cee5141eff41c827c2452883628474fbece82da4e135b"

RPROVIDES:${PN} += "python3-pyzmq python3.10dist(pyzmq) python310-pyzmq python310-pyzmq(aarch-64) python3dist(pyzmq)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libzmq.so.5()(64bit) python(abi)"

inherit rpm
