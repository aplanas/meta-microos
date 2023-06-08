SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "7.4.9"

RPM_NAME = "python39-jupyter-client7-7.4.9-2.1.noarch.rpm"
RPM_HASH = "fbbcb87409a2e73e1224b7ac032584e3ee4d66cd941e8ca7e2d5a0e71f20c7a8851d0d318d68fb87fdf0ef0b78e723e01a7635292e66ee9d01f4fd0a84507f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client jupyter-jupyter-client-doc jupyter-jupyter-client7 jupyter-jupyter_client python3.9dist(jupyter-client) python39-jupyter-client python39-jupyter-client7 python39-jupyter_client python3dist(jupyter-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-entrypoints python39-jupyter-core python39-nest-asyncio python39-python-dateutil python39-pyzmq python39-tornado python39-traitlets update-alternatives"

inherit rpm
