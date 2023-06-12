SUMMARY = "Documentation for python-gunicorn"
DESCRIPTION = "Gunicorn 'Green Unicorn' is a Python WSGI HTTP Server for UNIX. It's a pre-fork \
worker model ported from Ruby's Unicorn_ project. The Gunicorn server is broadly \
compatible with various web frameworks. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python-gunicorn-doc-20.1.0-4.1.noarch.rpm"
RPM_HASH = "10d708e35b52520335a95d7997b6f98ef5cd2ce4217e997bc5b550dfb07af9fd6e38c631672035ee3bfcb6aa29f58ed79332f5610f3cf3ba3b1c8559e7ab9dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gunicorn-doc \
python310-gunicorn-doc \
python311-gunicorn-doc \
python39-gunicorn-doc"
RDEPENDS:${PN} += ""

inherit rpm
