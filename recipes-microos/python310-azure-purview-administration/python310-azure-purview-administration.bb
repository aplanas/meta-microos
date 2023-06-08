SUMMARY = "Microsoft Azure Purview Administration Client Library for Python"
DESCRIPTION = "Azure Purview is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-purview-administration-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "825a7320d86670974d49b7f486c99a7e5abc49478c471774cdd7655b87950696b2ae999301cedafb6e62e88510121748f1f046c6fd12e74d8f768e056f277aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-administration python3.10dist(azure-purview-administration) python310-azure-purview-administration python3dist(azure-purview-administration)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-azure-purview-nspkg python310-msrest python310-six"

inherit rpm
