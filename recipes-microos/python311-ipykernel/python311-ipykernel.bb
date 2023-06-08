SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.22.0"

RPM_NAME = "python311-ipykernel-6.22.0-1.1.noarch.rpm"
RPM_HASH = "8c6f5d31476234db474b354bf78945f86de5ebf0cdd782737573de8b205de45657960ec82a8d05b942ecd492ebc16d19df0e647f169ac923f8fb0a9239ccf9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipykernel) python310-ipykernel-doc python310-jupyter-ipykernel-doc python310-jupyter_ipykernel-doc python311-ipykernel python311-ipykernel-doc python311-jupyter-ipykernel-doc python311-jupyter_ipykernel python311-jupyter_ipykernel-doc python39-ipykernel-doc python39-jupyter-ipykernel-doc python39-jupyter_ipykernel-doc python3dist(ipykernel)"
RDEPENDS:${PN} += "(python311-jupyter-core >= 5.1 or (python311-jupyter-core >= 4.12 with python311-jupyter-core < 5.0)) jupyter-jupyter-client python(abi) python311-comm python311-debugpy python311-ipython python311-jupyter-client python311-matplotlib-inline python311-nest-asyncio python311-packaging python311-psutil python311-pyzmq python311-tornado python311-traitlets"

inherit rpm
