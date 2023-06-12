SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python39-term-background-1.0.1-1.6.noarch.rpm"
RPM_HASH = "887a4661808e2dc8a66021747d9e837da4c54cd944e44084ea836e7fe10258a95c8f1f09d554ce7ae34a53817d338d888da1001093483332408fec26cdd8f9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(term-background) \
python39-term-background \
python3dist(term-background)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
