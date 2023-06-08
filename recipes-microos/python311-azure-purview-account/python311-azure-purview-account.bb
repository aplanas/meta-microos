SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-purview-account-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "5579ce9c23bfefad97cd63d51ccb4d3f0599897b3711646842292cee2fbff3c844b5bf26f7bd576638e52d9ec2d27eec268983bfb500ce2e727de18b42fb94ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-purview-account) python311-azure-purview-account python3dist(azure-purview-account)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-azure-purview-nspkg python311-msrest python311-six"

inherit rpm
