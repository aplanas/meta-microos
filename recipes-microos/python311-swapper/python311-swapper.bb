SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python311-swapper-1.1.2.post1-2.7.noarch.rpm"
RPM_HASH = "5f716f0e08ebb4a8fea7742e96971953f78de53643c538415cd4e315c91289b2e4dff3325b582477220202e389251f78ef12bd366608eeebb25707ad8c905234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(swapper) python311-swapper python3dist(swapper)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
