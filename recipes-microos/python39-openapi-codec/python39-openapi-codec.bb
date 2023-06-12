SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python39-openapi-codec-1.3.2-2.8.noarch.rpm"
RPM_HASH = "5b86e516ca51cfb2e6b31f9426e51df02cdee8778094a95531059c36da0feb0ddb1ea8124d45f8e71e643b9b39785e8ab4a2b00ddbc06da49ab71dc76c608d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openapi-codec) \
python39-openapi-codec \
python3dist(openapi-codec)"
RDEPENDS:${PN} += "python(abi) \
python39-coreapi"

inherit rpm
