SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "python311-autodocsumm-0.2.11-2.1.noarch.rpm"
RPM_HASH = "e0bc6efb2ed0c33aa3b3b11c22a7866e750f53789023671343e8a02475acb6ab447c7e370b54a0b85fe4689d5aaad0db25357705d311b2ea7780a863a703ef59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autodocsumm) python311-autodocsumm python3dist(autodocsumm)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
