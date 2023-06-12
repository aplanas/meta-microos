SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python39-bobodoctestumentation-2.4.0-3.8.noarch.rpm"
RPM_HASH = "3904d20d237d8b953e44fe92d0378f1b4c4f8b3426a906424fe2338e0c00f8b43fd7ab910879d7ee2aa328a32e39e0903af180fba49e65dad9d4c5ae33e7c2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bobodoctestumentation) \
python39-bobodoctestumentation \
python3dist(bobodoctestumentation)"
RDEPENDS:${PN} += "python(abi) \
python39-WebTest \
python39-manuel \
python39-six \
python39-zope.testing"

inherit rpm
