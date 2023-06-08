SUMMARY = "Azure DataLake service client library for Python"
DESCRIPTION = "This preview package for Python includes ADLS Gen2 specific API support made \
available in Storage SDK. \
 \
This includes: \
 \
1. New directory level operations (Create, Rename, Delete) for hierarchical namespace \
   enabled (HNS) storage account. For HNS enabled accounts, the rename/move operations \
   are atomic. \
2. Permission related operations (Get/Set ACLs) for hierarchical namespace enabled \
   (HNS) accounts."
LICENSE = "MIT"

PV = "12.11.0"

RPM_NAME = "python311-azure-storage-file-datalake-12.11.0-1.1.noarch.rpm"
RPM_HASH = "c0fe1ee80074787b205cbec6c6b847fc046a9dd897b2c559047705d672cb71589406e5700a8d7f64e2a992f08e32a98468b55768153a10eaf9cd8bff0cff5697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-file-datalake) python311-azure-storage-file-datalake python3dist(azure-storage-file-datalake)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-nspkg python311-azure-storage-blob python311-azure-storage-nspkg python311-isodate"

inherit rpm
