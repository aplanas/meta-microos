SUMMARY = "Integrate Azure Functions with Azure DevOps for the Azure CLI"
DESCRIPTION = "Python package for integrating Azure Functions with Azure DevOps. \
Specifically made for the Azure CLI."
LICENSE = "MIT"

PV = "0.0.22"

RPM_NAME = "python311-azure-functions-devops-build-0.0.22-2.11.noarch.rpm"
RPM_HASH = "0cccf48ac429b7aca1302ab2bfed7307c1e5490ddd1177f63a4364ad33d3edd99a8471d7bd5f7aa5a44e36d3e6da8a27fed51fb9ed36a4ccf9671c407383686f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-functions-devops-build) python311-azure-functions-devops-build python3dist(azure-functions-devops-build)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-msrest python311-vsts"

inherit rpm
