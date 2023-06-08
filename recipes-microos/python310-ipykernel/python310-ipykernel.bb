SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.22.0"

RPM_NAME = "python310-ipykernel-6.22.0-1.1.noarch.rpm"
RPM_HASH = "e6d5ee9edcb593d00b24df4280eb6fce5536ce8fac992a44326ca132f3b778e6c7e24a434273deae7968cdc06e2a96086c835eae2a6b40150ed7b6b0663f0a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipykernel python3-ipykernel python3-jupyter_ipykernel python3.10dist(ipykernel) python310-ipykernel python310-ipykernel-doc python310-jupyter-ipykernel-doc python310-jupyter_ipykernel python310-jupyter_ipykernel-doc python311-ipykernel-doc python311-jupyter-ipykernel-doc python311-jupyter_ipykernel-doc python39-ipykernel-doc python39-jupyter-ipykernel-doc python39-jupyter_ipykernel-doc python3dist(ipykernel)"
RDEPENDS:${PN} += "(python310-jupyter-core >= 5.1 or (python310-jupyter-core >= 4.12 with python310-jupyter-core < 5.0)) jupyter-jupyter-client python(abi) python310-comm python310-debugpy python310-ipython python310-jupyter-client python310-matplotlib-inline python310-nest-asyncio python310-packaging python310-psutil python310-pyzmq python310-tornado python310-traitlets"

inherit rpm
