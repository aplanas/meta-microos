SUMMARY = "Microsoft Azure Schema Registry Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, \
providing schema storage, versioning, and management. The registry is leveraged \
by serializers to reduce payload size while describing payload structure with \
schema identifiers rather than full schemas."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-schemaregistry-1.2.0-1.3.noarch.rpm"
RPM_HASH = "4b218abd99174790ddb77280dffb51c56343eae2663fc3c3e8c14ed78e6b8b7bfd3130e95b6f3c4e7e43ac95192cf2fcab123aba266693c6582e3a976f493703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-schemaregistry) python39-azure-schemaregistry python3dist(azure-schemaregistry)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-msrest"

inherit rpm
