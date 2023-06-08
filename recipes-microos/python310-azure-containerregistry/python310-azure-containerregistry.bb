SUMMARY = "Microsoft Azure Container Registry Client Library for Python"
DESCRIPTION = "Azure Container Registry allows you to store and manage container images and \
artifacts in a private registry for all types of container deployments. \
 \
Use the client library for Azure Container Registry to: \
 \
 * List images or artifacts in a registry \
 * Obtain metadata for images and artifacts, repositories and tags \
 * Set read/write/delete properties on registry items \
 * Delete images and artifacts, repositories and tags"
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-containerregistry-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "cd04e7a51db70fc4f573c66198d3a221dd4493148e48a40e4bd0ad50d49ad2a065d2501c7c275deaa66cf61ca4b183cd8309de2f76fa1989b89bbb5f4c2cece8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-containerregistry python3.10dist(azure-containerregistry) python310-azure-containerregistry python3dist(azure-containerregistry)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-msrest"

inherit rpm
