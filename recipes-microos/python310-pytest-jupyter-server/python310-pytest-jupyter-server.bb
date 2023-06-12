SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-server-0.7.0-1.1.noarch.rpm"
RPM_HASH = "0e0a76a571ca2ee1c6a7ecd26974d92676e9d5b7b8ebca8aad5df8d11f48a34cfc08a48a1c1503fccc4a7f03e9198ef7a3315c70c049b3baba2fc79246e5c662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-server \
python310-pytest-jupyter-server"
RDEPENDS:${PN} += "python310-jupyter-server \
python310-nbformat \
python310-pytest-jupyter \
python310-pytest-jupyter-client"

inherit rpm
