SUMMARY = "Supply Chain Transparency Log"
DESCRIPTION = "Rekor's goals are to provide an immutable tamper resistant ledger of metadata generated within a software projects supply chain. Rekor will enable software maintainers and build systems to record signed metadata to an immutable record. Other parties can then query said metadata to enable them to make informed decisions on trust and non-repudiation of an object's lifecycle. For more details visit the sigstore website \
 \
The Rekor project provides a restful API based server for validation and a transparency log for storage. A CLI application is available to make and verify entries, query the transparency log for inclusion proof, integrity verification of the transparency log or retrieval of entries by either public key or artifact. \
 \
Rekor fulfils the signature transparency role of sigstore's software signing infrastructure. However, Rekor can be run on its own and is designed to be extensible to working with different manifest schemas and PKI tooling."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "rekor-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "b620d1de3c4c0bd1aa3742e359f8f1767f9fa31a60c6c1df88c0cc174c14c73c65d2a224a0df0f8abd884fed815c18dc64f2af234936f89bff0fa3f5e5aff146"

RPROVIDES:${PN} += "rekor rekor(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
