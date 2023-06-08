SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python39-jupyter-server-test-2.5.0-1.2.noarch.rpm"
RPM_HASH = "6931b494ebe10983e576361af82091f5ba4c60c7f5f99dea880cfa8ace87437f8b63dff892c5800cd0c69e4ee37ed8c70afa4a6ed8b7bdbdc2af9959d129307a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-server-test"
RDEPENDS:${PN} += "python39-ipykernel python39-jupyter-server python39-pytest python39-pytest-console-scripts python39-pytest-jupyter-server python39-pytest-timeout python39-requests"

inherit rpm
