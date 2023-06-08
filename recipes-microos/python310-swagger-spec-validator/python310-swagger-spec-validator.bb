SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python310-swagger-spec-validator-3.0.3-1.3.noarch.rpm"
RPM_HASH = "57d6c2fc7567989a8cc2a7bf7e8506a4e74bbb61a715a1553db629eb055120677984d4e821330cc2ba28977b2a8145b1400907263f0cfa992c4db569e628385c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swagger-spec-validator python3.10dist(swagger-spec-validator) python310-swagger-spec-validator python3dist(swagger-spec-validator)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-jsonschema python310-typing_extensions"

inherit rpm
