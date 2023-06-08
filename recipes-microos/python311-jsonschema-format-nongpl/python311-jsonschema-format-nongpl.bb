SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema-format-nongpl-4.17.3-3.1.noarch.rpm"
RPM_HASH = "8955d7bd842ad7eba35f22f6a60f61d80363ff031463b3913741adaab15b3fbaeed19cee11b6739004e2d1e92e76cd73b75a265103383bd52b8fa0d7e0d62cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jsonschema-format-nongpl"
RDEPENDS:${PN} += "python311-fqdn python311-idna python311-isoduration python311-jsonpointer python311-jsonschema python311-rfc3339-validator python311-rfc3986-validator python311-uri_template python311-webcolors"

inherit rpm
