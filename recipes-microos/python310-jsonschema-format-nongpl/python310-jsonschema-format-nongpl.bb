SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema-format-nongpl-4.17.3-3.1.noarch.rpm"
RPM_HASH = "2b71a9b5a4ccc836d348adbc2596330e95807503e1ca64f21d8feb3d1240d171546334c3d0753ae14975058207e37a75e30729f5055e4b224e9759cfea756071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format-nongpl python310-jsonschema-format-nongpl"
RDEPENDS:${PN} += "python310-fqdn python310-idna python310-isoduration python310-jsonpointer python310-jsonschema python310-rfc3339-validator python310-rfc3986-validator python310-uri_template python310-webcolors"

inherit rpm
