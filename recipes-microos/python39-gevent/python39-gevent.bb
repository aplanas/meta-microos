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

RPM_NAME = "python39-gevent-22.10.1-3.1.aarch64.rpm"
RPM_HASH = "4eba1c8cacd83bc011b88b6a8154eac61f46d3e155abf89325ffefb5fa0bb73e5ad8038fcf69d9a5b47f780ab44c828e3346fc7494446b3d88c4f8a8c64bd68e"

RPROVIDES:${PN} += "python3.9dist(gevent) python39-gevent python39-gevent(aarch-64) python3dist(gevent)"
RDEPENDS:${PN} += "/usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libev.so.4()(64bit) python(abi) python39-cffi python39-dnspython python39-greenlet python39-requests python39-zope.event python39-zope.interface"

inherit rpm
