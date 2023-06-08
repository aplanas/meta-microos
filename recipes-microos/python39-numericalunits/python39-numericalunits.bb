SUMMARY = "Python module for defining quantities with units"
DESCRIPTION = "Units and dimensional analysis compatible with everything \
 \
This package implements units and dimensional analysis in an unconventional \
way with unique advantages: \
 \
* Compatible with everything \
* Zero storage overhead \
* Zero calculation overhead"
LICENSE = "MIT"

PV = "1.25"

RPM_NAME = "python39-numericalunits-1.25-1.8.noarch.rpm"
RPM_HASH = "d4f1dd88f0bd338746c024b7bc58871c00adce46bfc8280f116525cc11dcefdc14f981a980a5b9f216c7788add2e21dbdbb9688dc7a81c7094da42202a7d6031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(numericalunits) python39-numericalunits python3dist(numericalunits)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
