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

RPM_NAME = "python39-azure-storage-file-datalake-12.11.0-1.1.noarch.rpm"
RPM_HASH = "4b72728dd7c2633c5ba550f5bee5ebdc4d0939eec8ff8446bd49ea24557a57017362c94e1b441880e64b8e3354961c8ef0f01a219ab41f2f744ac56cea71f9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-file-datalake) python39-azure-storage-file-datalake python3dist(azure-storage-file-datalake)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) python(abi) python39-azure-core python39-azure-nspkg python39-azure-storage-blob python39-azure-storage-nspkg python39-isodate"

inherit rpm
