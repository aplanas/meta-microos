SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.22.0"

RPM_NAME = "python39-ipykernel-6.22.0-1.1.noarch.rpm"
RPM_HASH = "36c6ce525105ef2c34c79a46a8cafcb55e074e37f261245ea14c446e8ef645d7f95565c7933317a00b2eb1c2a4ae1ec38c80b40b053cb8cad4085ccbc55a467b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipykernel) python310-ipykernel-doc python310-jupyter-ipykernel-doc python310-jupyter_ipykernel-doc python311-ipykernel-doc python311-jupyter-ipykernel-doc python311-jupyter_ipykernel-doc python39-ipykernel python39-ipykernel-doc python39-jupyter-ipykernel-doc python39-jupyter_ipykernel python39-jupyter_ipykernel-doc python3dist(ipykernel)"
RDEPENDS:${PN} += "(python39-jupyter-core >= 5.1 or (python39-jupyter-core >= 4.12 with python39-jupyter-core < 5.0)) jupyter-jupyter-client python(abi) python39-comm python39-debugpy python39-ipython python39-jupyter-client python39-matplotlib-inline python39-nest-asyncio python39-packaging python39-psutil python39-pyzmq python39-tornado python39-traitlets"

inherit rpm
