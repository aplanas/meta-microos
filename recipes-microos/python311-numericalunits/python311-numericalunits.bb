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

RPM_NAME = "python311-numericalunits-1.25-1.8.noarch.rpm"
RPM_HASH = "aeb41fb9d61a73f3f85d0d5f810829d23f7d712e5b968b604a3bd218f12477734895d0af960513f4f3c864984e2054c870bb2cc1e1832d801a29fec1850814a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(numericalunits) python311-numericalunits python3dist(numericalunits)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
