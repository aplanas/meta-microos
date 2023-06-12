SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-openapi-schema-validator-0.4.4-1.1.noarch.rpm"
RPM_HASH = "3dc0e44fae86b713ba4185a9639d923d8b97e14c49c04bf7d57bec8ae9dfe44e836e9dd62a6ef0e860f16f9201867b6c8ca9dbaccbcab55fa16dbe23076d1d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openapi-schema-validator) python311-openapi-schema-validator python311-openapi_schema_validator python3dist(openapi-schema-validator)"
RDEPENDS:${PN} += "(python311-jsonschema >= 4 with python311-jsonschema < 4.18) python(abi) python311-rfc3339-validator"

inherit rpm
