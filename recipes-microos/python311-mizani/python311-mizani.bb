SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-mizani-0.8.1-1.2.noarch.rpm"
RPM_HASH = "e76abaef8b6541485d193972f4989641320e2aa0ce7c7d40b6cca452bcfd612758e1a628f71cb6a5bf1fdcf88c59656be4d4da7650d8cf545169e35006da22b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mizani) python311-mizani python3dist(mizani)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib python311-numpy python311-palettable python311-pandas python311-scipy"

inherit rpm
