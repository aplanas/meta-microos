SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-zope.deprecation-5.0-1.1.noarch.rpm"
RPM_HASH = "17bf3e7985fb8ee3286acb21f0a7f94947525c0bf904386cfce878b3e2033e0bf323ebb5e2afc945ecb2f7b4013ff0b30bfa48a92fab407a5281c044bd2f454e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.deprecation) python311-zope.deprecation python3dist(zope.deprecation)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
