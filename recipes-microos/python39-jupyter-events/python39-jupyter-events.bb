SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python39-jupyter-events-0.6.3-2.2.noarch.rpm"
RPM_HASH = "4cc587ee37c9b3f0c957bee4fb86577ce41940330172ddc837649d50478f6151b1d25b67ae3af5ca2bd1a35aaba023585ee0f9b6e566917a90e2397dc4bd9777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-events) python39-jupyter-events python39-jupyter_events python3dist(jupyter-events)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi) python39-PyYAML python39-jsonschema-format-nongpl python39-python-json-logger python39-rfc3339-validator python39-rfc3986-validator python39-traitlets"

inherit rpm
