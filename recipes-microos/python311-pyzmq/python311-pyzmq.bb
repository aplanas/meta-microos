SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python311-pyzmq-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "13cd7a31626693a3c0fc82ef65b70bcccc146a8a5a5f85a2476c24be3f5e403edcbc1197c1b38a68849c07cf765cd49655573c9fbf6af822fbe124db313d6820"

RPROVIDES:${PN} += "python3.11dist(pyzmq) python311-pyzmq python311-pyzmq(aarch-64) python3dist(pyzmq)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libzmq.so.5()(64bit) python(abi)"

inherit rpm
