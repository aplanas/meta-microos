SUMMARY = "Determine if shell has a light or dark background"
DESCRIPTION = "A python module to determine if a shell has a light or dark background."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python311-term-background-1.0.1-1.6.noarch.rpm"
RPM_HASH = "1cf8b9b02afc2af4c7a50cc477808f985f0430167c1e99bf35dde2155fc0e4d8aeae2259c27f658bc01c54567fb070f7a23c97fdac637d5f86b7cc5815c7abd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(term-background) \
python311-term-background \
python3dist(term-background)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
