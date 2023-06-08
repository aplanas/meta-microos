SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python311-cssmin-0.2.0-1.5.noarch.rpm"
RPM_HASH = "fb66290c123be6b5457fb3811f407e0760f2b586578fa70467a7710681aeccd74853fa68f6a507f9760b9300c3d0da956f33b616642bbd923d1239ebe52fba08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cssmin) python311-cssmin python3dist(cssmin)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
