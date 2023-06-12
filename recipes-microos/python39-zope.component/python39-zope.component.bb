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

RPM_NAME = "python39-zope.component-6.0-2.1.aarch64.rpm"
RPM_HASH = "8669770f056f7fe8655fd8c5102cbca0131024c16487e16650038cf3729dcd8ac7d91a3904384452144786c8a3031fa42761c449f21f57ae129fb8044a043e2e"

RPROVIDES:${PN} += "python3.9dist(zope.component) python39-zope.component python39-zope.component(aarch-64) python3dist(zope.component)"
RDEPENDS:${PN} += "python(abi) python39-zope.event python39-zope.hookable python39-zope.interface"

inherit rpm
