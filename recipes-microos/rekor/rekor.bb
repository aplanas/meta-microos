SUMMARY = "Supply Chain Transparency Log"
DESCRIPTION = "Rekor's goals are to provide an immutable tamper resistant ledger of metadata generated within a software projects supply chain. Rekor will enable software maintainers and build systems to record signed metadata to an immutable record. Other parties can then query said metadata to enable them to make informed decisions on trust and non-repudiation of an object's lifecycle. For more details visit the sigstore website \
 \
The Rekor project provides a restful API based server for validation and a transparency log for storage. A CLI application is available to make and verify entries, query the transparency log for inclusion proof, integrity verification of the transparency log or retrieval of entries by either public key or artifact. \
 \
Rekor fulfils the signature transparency role of sigstore's software signing infrastructure. However, Rekor can be run on its own and is designed to be extensible to working with different manifest schemas and PKI tooling."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "rekor-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "ada248a7834dcabc0f79403d9e3f7c4d0fc64baa14883c0827551248c7d52de51569d9af3f024c25d0b1fb60233e98abaf145d15c70270836a3ee04cb999eab6"

RPROVIDES:${PN} += "rekor \
rekor(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
