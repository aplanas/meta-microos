SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-openapi-2.22.1-1.1.noarch.rpm"
RPM_HASH = "b766363add330e924d4d203cb635ca0468b0841afa3a821a4d08ae99d02c72cd83a05c6d6b3978ed06286c6f10a3e231ab7fa5b552aa2932eb72dc2d706bf85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-openapi python310-jupyterlab-server-openapi"
RDEPENDS:${PN} += "(python310-openapi-core >= 0.16.1 with python310-openapi-core < 0.17) python310-jupyterlab-server python310-ruamel.yaml"

inherit rpm
