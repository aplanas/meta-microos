SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python311-bottle-0.12.25-4.1.noarch.rpm"
RPM_HASH = "32471c5859cd1408b26c33eaf6d9729d39cfeba2d65c819fc4d0f40c7b98455026ad5444156804d85f3eb2f29637ea65f1779ddc9ca500837c2e5f5824130e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bottle) \
python311-bottle \
python3dist(bottle)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
