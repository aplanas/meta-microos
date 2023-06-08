SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-confidentialledger-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "2009343dcc3ed6df48d51e8b7e6ca8116a5ca6c0d1222e835d5f2781221e4275fe66732d88b2dcfc579b59d8a5d0344b3375f761d829efb5b0ec99128a3188b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-confidentialledger) python311-azure-confidentialledger python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-isodate"

inherit rpm
