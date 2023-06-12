SUMMARY = "Microsoft Azure Confidential Ledger client library"
DESCRIPTION = "Azure Confidential Ledger provides a service for logging to an immutable, tamper-proof \
ledger. As part of the Azure Confidential Computing portfolio, Azure Confidential Ledger \
runs in secure, hardware-based trusted execution environments, also known as enclaves. \
It is built on Microsoft Research's Confidential Consortium Framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-confidentialledger-1.1.0-1.1.noarch.rpm"
RPM_HASH = "3d1700d94bdbe05247d7591dd02403f0f96a66bea1d814a74890d55b42cb1cc289d31c2784b95722cf2576e860920741e125af7c31dddc2fd994a2ac82284404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-confidentialledger) \
python39-azure-confidentialledger \
python3dist(azure-confidentialledger)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
