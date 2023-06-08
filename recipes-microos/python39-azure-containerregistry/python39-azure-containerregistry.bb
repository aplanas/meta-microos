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

RPM_NAME = "python39-azure-containerregistry-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "b3af74ce37aa802c64360b6d218653bac2d187d223ee7178f7e40c41af9655a99314b5c1e52cf7096fade9250facf34c5744e9cd132c3763378e28ad7980ae65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-containerregistry) python39-azure-containerregistry python3dist(azure-containerregistry)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-msrest"

inherit rpm
