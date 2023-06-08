SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python311-swagger-spec-validator-3.0.3-1.3.noarch.rpm"
RPM_HASH = "46b78d7444c2d9d4f859ad8548ae6c825d543c585028f2e3ebfd966b0a055a90ff57211d44c638aee5cb375f2cc266b1f9b2b266ab244f802cbd0ae7b9b37149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(swagger-spec-validator) python311-swagger-spec-validator python3dist(swagger-spec-validator)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-jsonschema python311-typing_extensions"

inherit rpm
