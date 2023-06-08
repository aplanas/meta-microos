SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-jupyter-server-terminals-0.4.4-1.3.noarch.rpm"
RPM_HASH = "fef978bcc304f0aee1fb8a12e5ad89173c2dd16db2569289be990b87b80210e3bffa86d170101cec2c02f24eb010e68de0d7f460375bc5d31998c5f06a9ec6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-server-terminals) python39-jupyter-server-terminals python39-jupyter_server_terminals python3dist(jupyter-server-terminals)"
RDEPENDS:${PN} += "jupyter-server-terminals python(abi) python39-terminado"

inherit rpm
