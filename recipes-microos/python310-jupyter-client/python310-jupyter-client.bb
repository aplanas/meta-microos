SUMMARY = "Jupyter protocol implementation and client libraries"
DESCRIPTION = "This package contains the reference implementation of the Jupyter protocol. \
It also provides client and kernel management APIs for working with kernels. \
 \
It also provides the jupyter kernelspec entrypoint for installing kernelspecs \
for use with Jupyter frontends."
LICENSE = "BSD-3-Clause"

PV = "8.2.0"

RPM_NAME = "python310-jupyter-client-8.2.0-1.1.noarch.rpm"
RPM_HASH = "8ca2de4a900020840b66792885d2ac5f926f6ea0f89895a3a5a9293ebfdc16a706aa6daf12011132940df1ce8bac958f80788789f629744c891d273044bcaa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-client jupyter-jupyter-client-doc jupyter-jupyter_client python3-jupyter-client python3-jupyter_client python3.10dist(jupyter-client) python310-jupyter-client python310-jupyter_client python3dist(jupyter-client)"
RDEPENDS:${PN} += "(python310-importlib-metadata >= 4.8.3 if python310-base < 3.10) (python310-jupyter-core >= 5.1 or (python310-jupyter-core >= 4.12 with python310-jupyter-core < 5.0)) /bin/sh /usr/bin/python3.10 python(abi) python310-entrypoints python310-python-dateutil python310-pyzmq python310-tornado python310-traitlets update-alternatives"

inherit rpm
