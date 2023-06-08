SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python310-azure-storage-queue-12.6.0-1.2.noarch.rpm"
RPM_HASH = "00c115e438f05197a8039b0a8b32b495c86636c96ac6b94abd4d3a53c4799df0a1031aa8db3f430a83f71c265d2a078792cec2903efb4f27beee56a0a85107c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-queue python3.10dist(azure-storage-queue) python310-azure-storage-queue python3dist(azure-storage-queue)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-core python310-azure-nspkg python310-azure-storage-common python310-azure-storage-nspkg python310-cryptography python310-isodate"

inherit rpm
