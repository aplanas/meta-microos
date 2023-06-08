SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-openapi-spec-validator-0.5.1-2.5.noarch.rpm"
RPM_HASH = "49d61796178fd24321437734523c02bdbe5d10134c30c8283de96c26a1a903c3064e51af07d1bc264be50efec3d67122d832c153fb318b66637edc42aeb5761e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openapi-spec-validator) python311-openapi-spec-validator python3dist(openapi-spec-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-importlib-resources python311-jsonschema python311-jsonschema-spec python311-lazy-object-proxy python311-openapi-schema-validator python311-setuptools update-alternatives"

inherit rpm
