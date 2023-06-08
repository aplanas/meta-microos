SUMMARY = "Interfaces for Python"
DESCRIPTION = "This package is intended to be independently reusable in any Python \
project. It is maintained by the Zope Toolkit project. \
 \
This package provides an implementation of object interfaces for Python. \
Interfaces are a mechanism for labeling objects as conforming to a given \
API or contract. So, this package can be considered as implementation of \
the Design By Contract methodology support in Python."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.interface-6.0-1.1.aarch64.rpm"
RPM_HASH = "d221c0644e0d3529d5ce6172bd8f478098a858cea027282812d011b612b65cd787a47eb6a76129d9686e12584bee2260271148c27c3a6b0eaa9bc8413b955db1"

RPROVIDES:${PN} += "python3.9dist(zope.interface) python39-zope.interface python39-zope.interface(aarch-64) python3dist(zope.interface)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-setuptools"

inherit rpm
