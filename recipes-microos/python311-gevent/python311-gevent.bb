SUMMARY = "Python network library that uses greenlet and libevent"
DESCRIPTION = "Gevent is a Python networking library that uses greenlet to provide synchronous \
API on top of a libevent event loop. Features include: \
 \
  * Fast event loop based on libevent. \
  * Lightweight execution units based on greenlet. \
  * Familiar API that re-uses concepts from the Python standard library. \
  * Cooperative sockets with ssl support. \
  * DNS queries performed through libevent-dns. \
  * Ability to use standard library and 3rd party modules written for standard \
    blocking sockets \
  * Fast WSGI server based on libevent-http. \
 \
gevent is inspired by eventlet but features more consistent API, simpler \
implementation and better performance. Read why others use gevent and check \
out the list of the open source projects based on gevent."
LICENSE = "MIT"

PV = "22.10.1"

RPM_NAME = "python311-gevent-22.10.1-3.1.aarch64.rpm"
RPM_HASH = "c15e7beb21ac01f62c16934e78599b5a521277aa576776887b4e2d42923c1174fbf4b88a3264f607628b66721cddc90f1fe5624972cb3d7ff13b68b19640d892"

RPROVIDES:${PN} += "python3.11dist(gevent) python311-gevent python311-gevent(aarch-64) python3dist(gevent)"
RDEPENDS:${PN} += "/usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libev.so.4()(64bit) python(abi) python311-cffi python311-dnspython python311-greenlet python311-requests python311-zope.event python311-zope.interface"

inherit rpm
