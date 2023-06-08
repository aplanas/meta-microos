SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python311-bobodoctestumentation-2.4.0-3.8.noarch.rpm"
RPM_HASH = "1f33f14b6c089ce3f8219b503202a648530b4d8b4df8e6f36c98697162af4b435e1333fff6a2c2b44bb3f58fa9c4a6fd0eded7d28e9246d968f2c86b12bd271a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bobodoctestumentation) python311-bobodoctestumentation python3dist(bobodoctestumentation)"
RDEPENDS:${PN} += "python(abi) python311-WebTest python311-manuel python311-six python311-zope.testing"

inherit rpm
