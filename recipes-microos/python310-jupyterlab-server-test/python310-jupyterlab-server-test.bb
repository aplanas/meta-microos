SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-test-2.22.1-1.1.noarch.rpm"
RPM_HASH = "9d40903fae1fc183fcdfa86b9f2cc190dcef4900aa4bd159b862f8ebdbdb5cff3fd93a6e95ee25864f274ecfa8680ea46e2b93eaa328957376b58ad013a5f82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-test python310-jupyterlab-server-test"
RDEPENDS:${PN} += "(python310-openapi-spec-validator >= 0.5.1 with python310-openapi-spec-validator < 0.6) python310-Werkzeug python310-ipykernel python310-jupyterlab-server-openapi python310-pytest python310-pytest-console-scripts python310-pytest-jupyter-server python310-pytest-timeout python310-requests-mock python310-strict-rfc3339"

inherit rpm
