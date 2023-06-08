SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python39-hypothesis-fspaths-0.1-2.8.noarch.rpm"
RPM_HASH = "d1042638b048539750e068436a8b265c054e5db7722ce6a5144f06a02fdf993b2ac33591ac162f4877117fb4db499098ba3ad1a85014eca86a949e6d613f0021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hypothesis-fspaths) python39-hypothesis-fspaths python3dist(hypothesis-fspaths)"
RDEPENDS:${PN} += "python(abi) python39-hypothesis"

inherit rpm
