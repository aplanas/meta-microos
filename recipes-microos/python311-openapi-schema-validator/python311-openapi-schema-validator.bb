SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "python311-openapi-schema-validator-0.3.4-2.2.noarch.rpm"
RPM_HASH = "2e50852360e9fd7f8d5558144a4269e1ca800e426066d727ef0741f74f5a9074f3e491cc463af14d91efcfc10d6362c4f1b39b799767d6012382acdf4feb5f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openapi-schema-validator) python311-openapi-schema-validator python3dist(openapi-schema-validator)"
RDEPENDS:${PN} += "python(abi) python311-isodate python311-jsonschema python311-setuptools python311-strict-rfc3339"

inherit rpm
