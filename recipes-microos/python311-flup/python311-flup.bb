SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python311-flup-1.0.3.dev20161029-2.20.noarch.rpm"
RPM_HASH = "e8b7ccbeba0a159409e20329223fd1affc523dab6839ceccc0dd2b5c8b458c4739fa40e8b52f591c6796a4b99c8b53d812063313b9a2b658decd9138cc41f53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flup) python311-flup python3dist(flup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
