SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-uri-template-1.2.0-3.1.noarch.rpm"
RPM_HASH = "e840e72d13303349edfcba3a973eeafb28e9dd380e9ed63a46584c2369fd44b2a3b5344eb794049015592cd4d6ec167b8bdc1758bb1a90a744da446ab3401b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uri-template) python311-uri-template python311-uri_template python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
