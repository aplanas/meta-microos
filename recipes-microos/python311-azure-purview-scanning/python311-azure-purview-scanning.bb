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

RPM_NAME = "python311-azure-purview-scanning-1.0.0b2-1.8.noarch.rpm"
RPM_HASH = "3afb2a55e45c52183d576193b57de733b5b25a2135473adbd1bd27791ef12fb25ada0ece5bc6efda3c9bd95fb4c1103ec1f4b5569feec306609c4b377c6f58ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-purview-scanning) python311-azure-purview-scanning python3dist(azure-purview-scanning)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-azure-purview-nspkg python311-msrest python311-six"

inherit rpm
