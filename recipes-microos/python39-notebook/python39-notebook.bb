SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "6.5.4"

RPM_NAME = "python39-notebook-6.5.4-1.1.noarch.rpm"
RPM_HASH = "a07042971c49fef61fd38b698c77a13758e84fe92c338d3fa9dc72e1daf310665caf9c5abeb17885f966536093c2d9a3918a710b4fe615e4d6003c03c549dbef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(notebook) python39-jupyter_notebook python39-notebook python3dist(notebook)"
RDEPENDS:${PN} += "(python39-jupyter-client >= 5.3.4 with python39-jupyter-client < 8) /bin/sh /usr/bin/python3.9 alts jupyter-notebook python(abi) python39-Jinja2 python39-Send2Trash python39-argon2-cffi python39-ipykernel python39-ipython_genutils python39-jupyter-core python39-nbclassic python39-nbconvert python39-nbformat python39-nest-asyncio python39-prometheus_client python39-pyzmq python39-terminado python39-tornado python39-traitlets"

inherit rpm
