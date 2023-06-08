SUMMARY = "Documentation for python-bottle"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library. \
 \
This subpackage contains the PDF documentation for python-bottle."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python-bottle-doc-0.12.25-3.1.noarch.rpm"
RPM_HASH = "18474fe45667ee3d97d63b5e93ae21c1b5e6f6161f35403cb5b91d7ded40d4a63fb0f3cb845c0002f5a2b4ba9ba61913e9a63ea93c8b58df978f255c8c6b3c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bottle-doc python310-bottle-doc python311-bottle-doc python39-bottle-doc"
RDEPENDS:${PN} += ""

inherit rpm
