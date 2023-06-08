SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-storage-common-2.1.0-2.11.noarch.rpm"
RPM_HASH = "c62aee7f06a328086c07a4bd6da96f1e4e394d0a92d93a57a85285a4fbdc64b8d36925bccbc976e69deaa2fca9baa4b248c293124a188aa029f0f1237f34705a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-common) python311-azure-storage-common python3dist(azure-storage-common)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-nspkg python311-azure-storage-nspkg python311-cryptography python311-python-dateutil python311-requests"

inherit rpm
