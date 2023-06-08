SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-urlextract-1.7.1-1.4.noarch.rpm"
RPM_HASH = "1f9aff541b4c036f1e2d05dfe45643b72fdfeddd37277e2c4e87d2bbcdfe53d5906f70df920b13962c3c605574e0e3af16b4dc291eb07db36610ac47548e7441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(urlextract) python311-urlextract python3dist(urlextract)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-dnspython python311-filelock python311-idna python311-platformdirs python311-uritools update-alternatives"

inherit rpm
