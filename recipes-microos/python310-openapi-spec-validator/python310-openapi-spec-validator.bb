SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-openapi-spec-validator-0.5.1-2.5.noarch.rpm"
RPM_HASH = "750e1b2bcb81d47bb2a6a03b727f555e2293192b6b198428af39141758066a3bb0b161a7fc9f622d408693a30429ed8448adc58551ee65a10ce16060306d8b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-spec-validator python3.10dist(openapi-spec-validator) python310-openapi-spec-validator python3dist(openapi-spec-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-importlib-resources python310-jsonschema python310-jsonschema-spec python310-lazy-object-proxy python310-openapi-schema-validator python310-setuptools update-alternatives"

inherit rpm
