SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python311-jupyter-server-test-2.5.0-1.2.noarch.rpm"
RPM_HASH = "bb16e3da1f2507b86ac14d9e5188e932555c4bfa3de71a960ffda9e1894402a2a86d22f143410e9d3a62a867a6e1fb8ef4efacf6684e3b5864a1117b836b9608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter-server-test"
RDEPENDS:${PN} += "python311-ipykernel \
python311-jupyter-server \
python311-pytest \
python311-pytest-console-scripts \
python311-pytest-jupyter-server \
python311-pytest-timeout \
python311-requests"

inherit rpm
