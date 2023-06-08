SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python311-bottle-0.12.25-3.1.noarch.rpm"
RPM_HASH = "2b6edeb9c1e5ad08756afdb0caab395ea885d1d910a25ff9b5e0ddd6beda7be12301d281d55b369cfa483a0ccf56889bce731fddbb7168450795b5f4cda85a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bottle) python311-bottle python3dist(bottle)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
