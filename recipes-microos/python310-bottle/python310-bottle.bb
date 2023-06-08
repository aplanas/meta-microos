SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python310-bottle-0.12.25-3.1.noarch.rpm"
RPM_HASH = "fa0ed7c012a78f4510c5d6b6ea2ab61c23fa2e8c58dd695322eddaecde55cd8febe514b31e562827daa08861e53d9f3c2f29a3912a7d2ba8309e6c9a7988c32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bottle python3.10dist(bottle) python310-bottle python3dist(bottle)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
