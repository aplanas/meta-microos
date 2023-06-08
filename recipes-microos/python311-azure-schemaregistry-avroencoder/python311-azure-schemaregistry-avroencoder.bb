SUMMARY = "Microsoft Azure Schema Registry Avro Encoder Client Library for Python"
DESCRIPTION = "Azure Schema Registry is a schema repository service hosted by Azure Event Hubs, providing \
schema storage, versioning, and management. This package provides an Avro encoder capable \
of encoding and decoding payloads containing Schema Registry schema identifiers and \
Avro-encoded content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-schemaregistry-avroencoder-1.0.0-1.3.noarch.rpm"
RPM_HASH = "ea3adc187a9d69624663a09f59f6477fc2dcbca66b54539d46f67040b6b24875081b516698356432d5c45b6c731ac61e49b9f671036474f533a115ed90a1fbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-schemaregistry-avroencoder) python311-azure-schemaregistry-avroencoder python3dist(azure-schemaregistry-avroencoder)"
RDEPENDS:${PN} += "python(abi) python311-avro python311-azure-nspkg python311-azure-schemaregistry python311-typing_extensions"

inherit rpm
