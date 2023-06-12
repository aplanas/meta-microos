SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python311-hypothesis-fspaths-0.1-2.8.noarch.rpm"
RPM_HASH = "ca2b54475ad3c15d6e0637771e198c3cf73c64b3d685e4e533914f6f8294dafdeecb925cab80dee2ea31870a2d177c0404b28fab9b742e35b64fcf9272ee41e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hypothesis-fspaths) \
python311-hypothesis-fspaths \
python3dist(hypothesis-fspaths)"
RDEPENDS:${PN} += "python(abi) \
python311-hypothesis"

inherit rpm
