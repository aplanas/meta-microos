SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-openapi-spec-validator-0.5.1-2.5.noarch.rpm"
RPM_HASH = "ddb4ff0b4124e672ea2bba56185f4b45b26dc1a4e16d1e66efbf5ab235863b9d3eed3e7639466a7f536da57ccdc610bc50752f8ac9bac333040fb856d85725f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openapi-spec-validator) python39-openapi-spec-validator python3dist(openapi-spec-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-importlib-resources python39-jsonschema python39-jsonschema-spec python39-lazy-object-proxy python39-openapi-schema-validator python39-setuptools update-alternatives"

inherit rpm
