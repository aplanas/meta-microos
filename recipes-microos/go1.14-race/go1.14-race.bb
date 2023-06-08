SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-race-1.14.15-1.13.aarch64.rpm"
RPM_HASH = "7145b06d60c7812786c29c24b5409860915f1618ed84cdf9511308c28079851cf3cdbd53a37074339b6db90113e2a0d1f1c2b03bc2252f549dbb18d248bea9ee"

RPROVIDES:${PN} += "go1.14-race go1.14-race(aarch-64)"
RDEPENDS:${PN} += "go1.14"

inherit rpm
