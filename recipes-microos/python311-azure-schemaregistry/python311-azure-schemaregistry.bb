SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-schemaregistry-1.2.0-1.3.noarch.rpm"
RPM_HASH = "8fc28773426aecd3cdf0521ff5f59dc79ebb63e1898dac3fc0428f56eb95af7fd6e0f73beb76bb3e1d77e1a020b5d1064a6504c09339ba63c748091476993ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-schemaregistry) python311-azure-schemaregistry python3dist(azure-schemaregistry)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-msrest"

inherit rpm
