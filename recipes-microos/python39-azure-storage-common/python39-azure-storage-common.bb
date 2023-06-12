SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-storage-common-2.1.0-2.11.noarch.rpm"
RPM_HASH = "789bdbd5600a2e078259637635f4b0655462dba7ffe0260396629de12d706299cacc28e0ede972513bdef1aa12523e24c71530a7cce6d590d0fff18887c67a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-common) \
python39-azure-storage-common \
python3dist(azure-storage-common)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-nspkg \
python39-azure-storage-nspkg \
python39-cryptography \
python39-python-dateutil \
python39-requests"

inherit rpm
