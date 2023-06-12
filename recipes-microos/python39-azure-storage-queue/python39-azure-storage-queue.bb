SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python39-azure-storage-queue-12.6.0-1.2.noarch.rpm"
RPM_HASH = "439da57caa4a642f85eb19c5d52e538133734ad537db58241c10b6360b99496a88bc44a6ba91978f782a5305353a7b9895b1c1dd090b875928e920d7d1ce177f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-queue) \
python39-azure-storage-queue \
python3dist(azure-storage-queue)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
