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

RPM_NAME = "python311-azure-containerregistry-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "132ced7d3a04755690767b97c95b67f8ec4f2ea11bf2ef7204c7ffc64e938534332a5eb43658e77c6a2103d1d4e2057faa779cf1647965dfb9a2815d2b3119e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-containerregistry) python311-azure-containerregistry python3dist(azure-containerregistry)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-msrest"

inherit rpm
