SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "python310-openapi-schema-validator-0.3.4-2.2.noarch.rpm"
RPM_HASH = "2cd4195b1a5ac08f1aa5c78fe7740d597d387d920abcf888b4102dd09ad7ef3eccb57aaca4b404eb07962721e2caff5476d64fc07645a46781693f3e39592e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-schema-validator python3.10dist(openapi-schema-validator) python310-openapi-schema-validator python3dist(openapi-schema-validator)"
RDEPENDS:${PN} += "python(abi) python310-isodate python310-jsonschema python310-setuptools python310-strict-rfc3339"

inherit rpm
