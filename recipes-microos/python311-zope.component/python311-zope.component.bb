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

RPM_NAME = "python311-zope.component-6.0-1.1.aarch64.rpm"
RPM_HASH = "2659d5fc5df21e53bc7ee311774172ccd0c04db7a6532a6514a7d443cd641adf7191be4fcae926825682c58333854a8046a5a5b3c52ec7aad1a8e6853293e24f"

RPROVIDES:${PN} += "python3.11dist(zope.component) python311-zope.component python311-zope.component(aarch-64) python3dist(zope.component)"
RDEPENDS:${PN} += "python(abi) python311-zope.event python311-zope.hookable python311-zope.interface"

inherit rpm
