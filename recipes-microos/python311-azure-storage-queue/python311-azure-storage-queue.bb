SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python311-azure-storage-queue-12.6.0-1.2.noarch.rpm"
RPM_HASH = "65adc292dffedc018521127a768a63ed0edd12cec8182edc848120e920dd2ec7dc5dee48a7bbd3a4f753eb46e9a4be9533baa6bae562e46df99585e1434b6d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-queue) python311-azure-storage-queue python3dist(azure-storage-queue)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-core python311-azure-nspkg python311-azure-storage-common python311-azure-storage-nspkg python311-cryptography python311-isodate"

inherit rpm
