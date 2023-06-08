SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.0-only"

PV = "0.56.0"

RPM_NAME = "python39-zeroconf-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "ab0caf9f0a6ce42e77e507ae9ba7b370fc6c125f64756d34dfd39c9740503cf84598321b334c99140e511f1a634d080e4ddb7bdc5d3dc6d43fa5f81892180518"

RPROVIDES:${PN} += "python3.9dist(zeroconf) python39-zeroconf python39-zeroconf(aarch-64) python3dist(zeroconf)"
RDEPENDS:${PN} += "python(abi) python39-async_timeout python39-ifaddr"

inherit rpm
