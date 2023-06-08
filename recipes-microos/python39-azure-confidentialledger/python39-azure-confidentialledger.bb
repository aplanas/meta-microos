SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-confidentialledger-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "366fe16fb42e76eb2507d69c5dfbee724e368684e0b93c6012847219be4f7a1c7a24f46f2b509bfcaefbed90ae63d2c5842ce045742c78aa60cd007bb5b5b74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-confidentialledger) python39-azure-confidentialledger python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-isodate"

inherit rpm
