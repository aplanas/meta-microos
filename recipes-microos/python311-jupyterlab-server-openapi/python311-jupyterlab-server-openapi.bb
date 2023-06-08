SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-openapi-2.22.1-1.1.noarch.rpm"
RPM_HASH = "0343d3a2a920acf8c7e5becc34611c1f7a26d389877cd41cf6207d2093f9b8aebb9a59200c0e030665fafdea21fdc5022bb19575165655cfe2c6ebe25560a2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-server-openapi"
RDEPENDS:${PN} += "(python311-openapi-core >= 0.16.1 with python311-openapi-core < 0.17) python311-jupyterlab-server python311-ruamel.yaml"

inherit rpm
