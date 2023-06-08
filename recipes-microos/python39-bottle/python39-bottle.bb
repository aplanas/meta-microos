SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python39-bottle-0.12.25-3.1.noarch.rpm"
RPM_HASH = "6b08b9ce963b6487b43d61a218d8501e64222ca43e1c6a5d5074b83708dbd97388fa4e825241a9b95bb705bd0df3f8e6dff85f1fcb0c49b91b7d1bb1fca8f73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bottle) python39-bottle python3dist(bottle)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
