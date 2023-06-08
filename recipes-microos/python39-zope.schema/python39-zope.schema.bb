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

RPM_NAME = "python39-zope.schema-7.0.1-1.3.noarch.rpm"
RPM_HASH = "e779fe03fa1a5dd9c6739836e7341a276fb76564533bd04d82db9c3146f7ef928a07f7e569dc3a82e0822bae79c4125c37cfe1f364c96cdb2e57159696ca4031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.schema) python39-zope.schema python3dist(zope.schema)"
RDEPENDS:${PN} += "python(abi) python39-zope.event python39-zope.interface"

inherit rpm
