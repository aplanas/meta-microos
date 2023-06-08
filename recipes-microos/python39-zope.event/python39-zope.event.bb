SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.event-4.6-3.1.noarch.rpm"
RPM_HASH = "64a0ebd38862f4f317edd43b1302fd2e676218278951f0306872a1685dfe37c277326fe881be2fcb6a529a8a0a26c0bae4093c81a5d823660de751bb4d11bf68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.event) python39-zope.event python3dist(zope.event)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
