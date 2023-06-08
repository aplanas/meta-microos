SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python310-jupyter-server-test-2.5.0-1.2.noarch.rpm"
RPM_HASH = "0ef758c8de61de4cad057722f802b4eb5d9a1bfcb22d69d63f7da5bef89b927d6a39ba23fa55b54a12fea6fcf219269ed011183c1bd69aa99c5f44a7248d471c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-test python310-jupyter-server-test"
RDEPENDS:${PN} += "python310-ipykernel python310-jupyter-server python310-pytest python310-pytest-console-scripts python310-pytest-jupyter-server python310-pytest-timeout python310-requests"

inherit rpm
