SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-sphinx-removed-in-0.2.1-2.3.noarch.rpm"
RPM_HASH = "87bfec711ba14ac4595016266a6994022b9e688708ecea0468ff037122787de22814659b17d4890b0baabfdca487cd0860c0627a9784c554091b6033786277f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-removed-in) python39-sphinx-removed-in python3dist(sphinx-removed-in)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
