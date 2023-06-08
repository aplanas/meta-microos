SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.9.0-2.1.noarch.rpm"
RPM_HASH = "40e9f0c233a22a2b24217c26e6687c0e1a3eb1c798f52eef539d49b6fd8aaabd6e62c97b185a6fa8d9930531e828b00f41da197c03d0ca124049bf84f2c91782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"
RDEPENDS:${PN} += "jupyter-jupyterlab python3dist(ipyvue)"

inherit rpm
