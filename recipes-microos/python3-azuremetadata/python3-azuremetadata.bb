SUMMARY = "Python module for collecting instance metadata from Azure"
DESCRIPTION = "A module for collecting instance metadata from Microsoft Azure."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.5"

RPM_NAME = "python3-azuremetadata-5.1.5-1.5.noarch.rpm"
RPM_HASH = "3bb84ab8dbb8287256d7979f043c520b31cbc3c1117303af21479ac358a62c2f8c05d5186e0ee6b6076aaf76e053299b877a7fbab3151d3c559e150721ee5073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azuremetadata \
python3-azuremetadata \
python3.10dist(azuremetadata) \
python3dist(azuremetadata)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3"

inherit rpm
