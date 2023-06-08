SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "python39-openapi-schema-validator-0.3.4-2.2.noarch.rpm"
RPM_HASH = "9545b5c6a25007fdb0d5f851aec35d45c78fd50d6eec260aaae0d900b1deffe751b4d2c6141b4c88fc21d71c0d8da320dc803e45be5ff5b7cd9b615701198185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openapi-schema-validator) python39-openapi-schema-validator python3dist(openapi-schema-validator)"
RDEPENDS:${PN} += "python(abi) python39-isodate python39-jsonschema python39-setuptools python39-strict-rfc3339"

inherit rpm
