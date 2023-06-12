SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.event-4.6-4.1.noarch.rpm"
RPM_HASH = "f343f9a4ecf5a7a7078f406d1d4e2b5f8232fb419554baaae13f2c56ceb7217806163a910babdbeb5ebb213698b82ad3bc6486fe552ffbbcb13dce7206544584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event \
python3.10dist(zope.event) \
python310-zope.event \
python3dist(zope.event)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
