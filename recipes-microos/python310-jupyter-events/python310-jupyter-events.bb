SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python310-jupyter-events-0.6.3-2.2.noarch.rpm"
RPM_HASH = "1e8d0abde979ea14c02a06688dfcc65b295f00ce0318b95c771f19c5d4e97f02d970b300fe38d994ec49739b3f8126d153564d468918542c82395abb9910f4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-events \
python3-jupyter_events \
python3.10dist(jupyter-events) \
python310-jupyter-events \
python310-jupyter_events \
python3dist(jupyter-events)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-PyYAML \
python310-jsonschema-format-nongpl \
python310-python-json-logger \
python310-rfc3339-validator \
python310-rfc3986-validator \
python310-traitlets"

inherit rpm
