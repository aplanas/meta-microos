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

RPM_NAME = "python310-zope.schema-7.0.1-2.1.noarch.rpm"
RPM_HASH = "773a4e3767a6f59d91c34c639508ecf2a7af33f436f0ae9757bf1538b5a4695d781effbcaa87bd70e13532b38e81fea54196a63713b1d6a8bc4b1a895df4f71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.schema python3.10dist(zope.schema) python310-zope.schema python3dist(zope.schema)"
RDEPENDS:${PN} += "python(abi) python310-zope.event python310-zope.interface"

inherit rpm
