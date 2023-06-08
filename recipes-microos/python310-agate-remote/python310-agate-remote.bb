SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-agate-remote-0.2.1-1.3.noarch.rpm"
RPM_HASH = "6c1eb91b2bf0d9389ce7864845b4c0d019b1f879557d1b155d1739cb7a1a77a28a1938937d7a3ff3ec4935c7b6e582deabf32d6ebb958ec67056b83029a80430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-remote python3.10dist(agate-remote) python310-agate-remote python3dist(agate-remote)"
RDEPENDS:${PN} += "python(abi) python310-agate python310-requests"

inherit rpm
