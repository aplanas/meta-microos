SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-openapi-2.22.1-1.2.noarch.rpm"
RPM_HASH = "c6f9bd4f68c273ed7573ab1d4ad5bd8d33211d4da40d025b87733b91d12846c8e4aef45c2a206943d4cded74f77588efd51544fdadadd95680dbe19c7897c2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-server-openapi"
RDEPENDS:${PN} += "(python311-openapi-core >= 0.16.1 with python311-openapi-core < 0.17) \
python311-jupyterlab-server \
python311-ruamel.yaml"

inherit rpm
