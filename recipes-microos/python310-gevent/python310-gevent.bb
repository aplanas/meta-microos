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

PV = "22.10.2"

RPM_NAME = "python310-gevent-22.10.2-2.1.aarch64.rpm"
RPM_HASH = "71db1bbe5d2adfc59d2e7ec2cd97731023e5c7a4d5b64df3fe53f99e7d362bf9920a9eedf9dddbe3b0501df9526ab6c4f8a7193af1fd367d14d460d60f6eb51c"

RPROVIDES:${PN} += "python3-gevent python3.10dist(gevent) python310-gevent python310-gevent(aarch-64) python3dist(gevent)"
RDEPENDS:${PN} += "/usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libev.so.4()(64bit) python(abi) python310-cffi python310-dnspython python310-greenlet python310-requests python310-zope.event python310-zope.interface"

inherit rpm
