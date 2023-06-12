SUMMARY = "MS Azure Storage Client Library for Python - with Multi API version Support"
DESCRIPTION = "Microsoft Azure Storage Client Library for Python - with Multi API version Support \
 \
Handles multi-API versions of Azure Storage Data Plane originally from https://github.com/Azure/azure-storage-python. \
 \
**NOTE:** \
 \
- This is not an official Azure Storage SDK. \
 \
- It is used by https://github.com/Azure/azure-cli to support multiple API versions. \
 \
- The official Azure Storage SDK is at https://github.com/Azure/azure-storage-python."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-multiapi-storage-1.1.0-1.1.noarch.rpm"
RPM_HASH = "73742b617ae3a9b696a4be2cbd4bfea8fdbe7aa68397bd2f0b0b49b0a2217c93d8d9c007df92af63dcd1c3cacd71567f03a30626062798761f4b9f7db82ad860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-multiapi-storage) \
python39-azure-multiapi-storage \
python3dist(azure-multiapi-storage)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-msrest \
python39-python-dateutil \
python39-requests"

inherit rpm
