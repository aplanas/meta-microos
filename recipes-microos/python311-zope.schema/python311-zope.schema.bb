SUMMARY = "Zope interface extension for defining data schemas"
DESCRIPTION = "Schemas extend the notion of interfaces to detailed descriptions of \
Attributes (but not methods).  Every schema is an interface and \
specifies the public fields of an object.  A *field* roughly \
corresponds to an attribute of a Python object.  But a Field provides \
space for at least a title and a description.  It can also constrain \
its value and provide a validation method.  Besides you can optionally \
specify characteristics such as its value being read-only or not \
required."
LICENSE = "ZPL-2.1"

PV = "7.0.1"

RPM_NAME = "python311-zope.schema-7.0.1-1.3.noarch.rpm"
RPM_HASH = "9950f9124fcf1d106c5f09744d7f3af07cb4e1bbf4c3944ff73f3b72396a998cd1af3b306e641c9975b53c32c3c5d510a822eb0359ff54a14266fb96a597c082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.schema) python311-zope.schema python3dist(zope.schema)"
RDEPENDS:${PN} += "python(abi) python311-zope.event python311-zope.interface"

inherit rpm
