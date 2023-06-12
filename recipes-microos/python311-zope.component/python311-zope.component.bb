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

RPM_NAME = "python311-zope.component-6.0-2.1.aarch64.rpm"
RPM_HASH = "f120ce2bacfcc6262e7efec2719db0ddca5796998bdcaf60ea680a12cc50161078caac1b366e698245977d8ba77e7a0848253a2103fbb7e9012f7cc301756a56"

RPROVIDES:${PN} += "python3.11dist(zope.component) python311-zope.component python311-zope.component(aarch-64) python3dist(zope.component)"
RDEPENDS:${PN} += "python(abi) python311-zope.event python311-zope.hookable python311-zope.interface"

inherit rpm
