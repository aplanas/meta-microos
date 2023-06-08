SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python39-swagger-spec-validator-3.0.3-1.3.noarch.rpm"
RPM_HASH = "722b6485180646c2fa1d0fea98438bdf75ad41a478bc8a626fc1e8647e37b77dfde263d4425374cb29483a438d9f0828385eb768e58960236545e28baf6604cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(swagger-spec-validator) python39-swagger-spec-validator python3dist(swagger-spec-validator)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-jsonschema python39-typing_extensions"

inherit rpm
