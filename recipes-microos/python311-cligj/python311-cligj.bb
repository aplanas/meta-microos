SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python311-cligj-0.7.2-1.5.noarch.rpm"
RPM_HASH = "128ca666a128d45ed58bac30beeda288829840dc293395fa1df075b35d3215a04d55aa2df7503ecfc0e88700dc99796976a71262da448031fcf7cc3ae3120f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cligj) python311-cligj python3dist(cligj)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
