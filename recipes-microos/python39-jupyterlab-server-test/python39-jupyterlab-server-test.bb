SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-test-2.22.1-1.1.noarch.rpm"
RPM_HASH = "0bc781ca8ed2c178443460834903fd7524bc1fc41b9dcc73ac627904abe8b720b7b6d512706894dc6a89a4f79b048f0e4fc01054f140bbc404bc0adaed27125e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-test"
RDEPENDS:${PN} += "(python39-openapi-spec-validator >= 0.5.1 with python39-openapi-spec-validator < 0.6) python39-Werkzeug python39-ipykernel python39-jupyterlab-server-openapi python39-pytest python39-pytest-console-scripts python39-pytest-jupyter-server python39-pytest-timeout python39-requests-mock python39-strict-rfc3339"

inherit rpm
