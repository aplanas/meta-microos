SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-confidentialledger-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "57d6b00bcfb7fff6dd48878ccdc8d484e2f98579cf6fb26e32c8b092511cb31701afa0c50eed9e51706a27d5bac2870b481842f812a6110652bfa645bb55b599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-confidentialledger python3.10dist(azure-confidentialledger) python310-azure-confidentialledger python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-isodate"

inherit rpm
