SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.event-4.6-3.1.noarch.rpm"
RPM_HASH = "59ebfdb0a8a35261393f5aeff275e8144e5d5efefe021e6c2bb1314882d61aa750c3fecec75a304577fcd8beaf5f5dc8121e08d1047dd71d7fe8cee68802b6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.event) python311-zope.event python3dist(zope.event)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
