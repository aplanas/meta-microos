SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-test-2.22.1-1.2.noarch.rpm"
RPM_HASH = "051ce0d04230a4f6933d87bcf9a9c479011abccf123f7eda16bce0d3488c0f5b78c31bd73537f568dc090df1777704f10a31317de2d4d88f60a5de27faba3ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-server-test"
RDEPENDS:${PN} += "(python311-openapi-spec-validator >= 0.5.1 with python311-openapi-spec-validator < 0.6) python311-Werkzeug python311-ipykernel python311-jupyterlab-server-openapi python311-pytest python311-pytest-console-scripts python311-pytest-jupyter-server python311-pytest-timeout python311-requests-mock python311-strict-rfc3339"

inherit rpm
