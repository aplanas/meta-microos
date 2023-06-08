SUMMARY = "Microsoft Azure Purview Scanning Client Library for Python"
DESCRIPTION = "Azure Purview Scanning is a fully managed cloud service whose users can scan your \
data into your data estate (also known as your catalog). Scanning is a process by \
which the catalog connects directly to a data source on a user-specified schedule. \
 \
 * Scan your data into your catalog \
 * Examine your data \
 * Extract schemas from your data"
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-purview-scanning-1.0.0b2-1.8.noarch.rpm"
RPM_HASH = "bdcb248242e806f919e628a1b6f4c3a742b3d366b92f95ee9873a7d02388baef6eae6fcc7275d9aaf1f98ee44664f3dba56de5b71cd5fc8bea0a8310d41e7b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-purview-scanning) python39-azure-purview-scanning python3dist(azure-purview-scanning)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-azure-purview-nspkg python39-msrest python39-six"

inherit rpm
