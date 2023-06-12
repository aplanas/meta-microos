SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-confidentialledger-1.1.0-1.1.noarch.rpm"
RPM_HASH = "2f1ff6b2f503d324ad7cefe965913d5fccdfc41a4d1be6216179f84b692ecbfb490ad0af358c021f6e345bdb7323775ec99b31e5e63ee135ebbb3548ca71276e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-confidentialledger) python311-azure-confidentialledger python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-cryptography python311-isodate"

inherit rpm
