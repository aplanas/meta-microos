SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python311-python-slugify-5.0.2-2.1.noarch.rpm"
RPM_HASH = "3655eac8627e8db8f6b1a3f914f7a7580dad92d60acb88cac4fe7856cc83a16ffdc1506ab15c1b5acc5d653f319da84003654e929b7fc062244b4f5cdb4a6a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-slugify) python311-python-slugify python3dist(python-slugify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools python311-text-unidecode update-alternatives"

inherit rpm
