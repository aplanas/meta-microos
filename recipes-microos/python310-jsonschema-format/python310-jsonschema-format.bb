SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema-format-4.17.3-3.1.noarch.rpm"
RPM_HASH = "51464d21497434d7fb6d4633ed8ced23863b61968de4c863b206e7a5e176fb4e66c9321bb95ddc3ed3639cb1971ab3b3c21d97769cf8cf3ef711568123466938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format python310-jsonschema-format"
RDEPENDS:${PN} += "python310-fqdn python310-idna python310-isoduration python310-jsonpointer python310-jsonschema python310-rfc3339-validator python310-rfc3987 python310-uri_template python310-webcolors"

inherit rpm
