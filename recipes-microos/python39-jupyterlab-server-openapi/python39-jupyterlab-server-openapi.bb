SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-openapi-2.22.1-1.1.noarch.rpm"
RPM_HASH = "a4863cbcab15664aa4a407edb6018f01983c38c28e580173eb17d875ff29261870c187a622c48dbaf266ca015fdba2b44a900ddfd361e1c574735c82f5be1ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-openapi"
RDEPENDS:${PN} += "(python39-openapi-core >= 0.16.1 with python39-openapi-core < 0.17) python39-jupyterlab-server python39-ruamel.yaml"

inherit rpm
