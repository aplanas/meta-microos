SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "GPL-2.0-only"

PV = "0.2.10"

RPM_NAME = "python311-autodocsumm-0.2.10-1.1.noarch.rpm"
RPM_HASH = "ea5c95d84f731c665e58afa2614706a29f689320bc4adcc98143e098c260f9af9d603e301d31566d224ebff29c353e2bd5f8be4046765f21d27c110674be9c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autodocsumm) python311-autodocsumm python3dist(autodocsumm)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
