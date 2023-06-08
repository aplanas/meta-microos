SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-test-2.22.1-1.1.noarch.rpm"
RPM_HASH = "2e73ebe41627801a90001d8e0ecb6400fc12bcfc537bbd336e9df6e39d68f9943b950f9842dd93c34c101f6964a46e50336bdb484c8d2bb254feba8caf84b917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-server-test"
RDEPENDS:${PN} += "(python311-openapi-spec-validator >= 0.5.1 with python311-openapi-spec-validator < 0.6) python311-Werkzeug python311-ipykernel python311-jupyterlab-server-openapi python311-pytest python311-pytest-console-scripts python311-pytest-jupyter-server python311-pytest-timeout python311-requests-mock python311-strict-rfc3339"

inherit rpm
