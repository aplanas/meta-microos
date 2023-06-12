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

PV = "1.1.0"

RPM_NAME = "python39-azure-containerregistry-1.1.0-1.1.noarch.rpm"
RPM_HASH = "d21fa70cc65112b9363c2502c6d84476cd704d5c2aa3614f32bfe35864fc3ded9745f27287a26fd6ed5a0e855e0d111984a5d516b38d988514b825b638007456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-containerregistry) \
python39-azure-containerregistry \
python3dist(azure-containerregistry)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
