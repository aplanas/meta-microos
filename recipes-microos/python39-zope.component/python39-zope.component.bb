SUMMARY = "Zope Component Architecture"
DESCRIPTION = "This package is intended to be independently reusable in any Python project. It \
is maintained by the Zope Toolkit project. \
 \
This package represents the core of the Zope Component Architecture. Together \
with the 'zope.interface' package, it provides facilities for defining, \
registering and looking up components. \
 \
Please see http://docs.zope.org/zope.component/ or doc package for the \
documentation."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.component-6.0-1.1.aarch64.rpm"
RPM_HASH = "1be0c1e52e4e5f38453748a3d1f7f8597aadcbe590c4c03f2d8a309c92451cf0d8f4df41f6e243a4b3268e8df3f53f5b1a64125d3d106fbe6458d96b4526393d"

RPROVIDES:${PN} += "python3.9dist(zope.component) python39-zope.component python39-zope.component(aarch-64) python3dist(zope.component)"
RDEPENDS:${PN} += "python(abi) python39-zope.event python39-zope.hookable python39-zope.interface"

inherit rpm
