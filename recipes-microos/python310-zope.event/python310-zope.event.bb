SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.event-4.6-3.1.noarch.rpm"
RPM_HASH = "578a6fe5529b8d43f66a7fe7be455b91b10bd6267380a76762fa5b45e05565b5628c9ee913e9d722a3aa116b98ddb64a19b92a0e643b172c9549b0716c72b1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event python3.10dist(zope.event) python310-zope.event python3dist(zope.event)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
