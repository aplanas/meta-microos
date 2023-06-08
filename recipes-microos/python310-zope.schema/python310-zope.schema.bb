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

RPM_NAME = "python310-zope.schema-7.0.1-1.3.noarch.rpm"
RPM_HASH = "1987c40b951ba089906698186238c1e181e5245257c61bd6119bc6c2bb8bfcc4fd1dda2811fd2e2d4b230d1daee084ad9eaaf07af15af04074ec7c1e2dbbda4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.schema python3.10dist(zope.schema) python310-zope.schema python3dist(zope.schema)"
RDEPENDS:${PN} += "python(abi) python310-zope.event python310-zope.interface"

inherit rpm
