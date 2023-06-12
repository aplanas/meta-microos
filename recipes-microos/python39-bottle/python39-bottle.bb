SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python39-bottle-0.12.25-4.1.noarch.rpm"
RPM_HASH = "f2ba74b53aedab5e43850cede78b566b50358623611b9ca7846a221fc42cc426674f7f78e22ba6537d9a95b320c0de0a2e8db5401b1bda0ccc804e5805f22a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bottle) python39-bottle python3dist(bottle)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
