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

RPM_NAME = "python310-zope.component-6.0-1.1.aarch64.rpm"
RPM_HASH = "b9ab8dec119ff927a5405726714df3b9d1842c4375a3a720ef5fc44e5748957bddcede2080bb15009f2f8e7744163a591f46a444cb88233921b27146fe18a6c4"

RPROVIDES:${PN} += "python3-zope.component python3.10dist(zope.component) python310-zope.component python310-zope.component(aarch-64) python3dist(zope.component)"
RDEPENDS:${PN} += "python(abi) python310-zope.event python310-zope.hookable python310-zope.interface"

inherit rpm
