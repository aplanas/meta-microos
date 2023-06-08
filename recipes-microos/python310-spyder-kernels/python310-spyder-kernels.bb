SUMMARY = "Jupyter kernels for Spyder's console"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package provides Jupyter kernels for use with the consoles \
of Spyder. These can launched either through Spyder itself or \
in an independent Python session, and allow for interactive or \
file-based execution of Python code in different environments, \
all inside the IDE."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "python310-spyder-kernels-2.4.3-1.1.noarch.rpm"
RPM_HASH = "b936a709539e1e47ea0763dd4644cc49772e613ad12c961bd96727952870e6a41bfe349e6de7b271d1310dc2010f4bd6cfb6a381c17c1813104119436ca96594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-kernels python3.10dist(spyder-kernels) python310-spyder-kernels python3dist(spyder-kernels)"
RDEPENDS:${PN} += "(python310-ipykernel >= 6.16.1 with python310-ipykernel < 7) (python310-ipython >= 7.31.1 with python310-ipython < 9) (python310-jupyter_client >= 7.4.9 with python310-jupyter_client < 9) python(abi) python310-cloudpickle python310-pyzmq python310-wurlitzer"

inherit rpm
