SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python310-bobodoctestumentation-2.4.0-3.8.noarch.rpm"
RPM_HASH = "45fe602ec98991daf1d8d8ee95bf9fa8bdd91f15b4a80a21481c16c242f6d4acb899f9b708e95e8fee31421cface81f848081a2f25da258705a9246b098f9b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bobodoctestumentation python3.10dist(bobodoctestumentation) python310-bobodoctestumentation python3dist(bobodoctestumentation)"
RDEPENDS:${PN} += "python(abi) python310-WebTest python310-manuel python310-six python310-zope.testing"

inherit rpm
