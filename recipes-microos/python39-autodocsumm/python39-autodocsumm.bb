SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "GPL-2.0-only"

PV = "0.2.10"

RPM_NAME = "python39-autodocsumm-0.2.10-1.1.noarch.rpm"
RPM_HASH = "973d38cbf3e07e1a84d92ef7dd1cb9b1ad5ddc825027ad0c1afccc85a5048a7eb1d5f98d10b7008ff26056ac0c087b935ed83aaceac1bdfa2ac45d3498e7bb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autodocsumm) python39-autodocsumm python3dist(autodocsumm)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
