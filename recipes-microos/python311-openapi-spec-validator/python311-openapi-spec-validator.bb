SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python311-openapi-spec-validator-0.5.6-1.1.noarch.rpm"
RPM_HASH = "70630840891dfbad77052cfc6b34e08490bdbe7f832b86bb6e088f201948b63c505a2e1cc5f0b87ac2ac03f7fda520de49a4112776967b8de0391f04fd1c80ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openapi-spec-validator) python311-openapi-spec-validator python311-openapi_spec_validator python3dist(openapi-spec-validator)"
RDEPENDS:${PN} += "(python311-jsonschema >= 4.0.0 with python311-jsonschema < 4.18) /bin/sh /usr/bin/python3.11 python(abi) python311-importlib-resources python311-jsonschema-spec python311-lazy-object-proxy python311-openapi-schema-validator update-alternatives"

inherit rpm
