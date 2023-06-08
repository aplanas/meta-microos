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

RPM_NAME = "python311-spyder-kernels-2.4.3-1.1.noarch.rpm"
RPM_HASH = "e99a716513d00406526dce25c134bc349514b7b1e6b3e30d8d4e87cc98f3dc471e337db875794e50e8d763db4095f488a8cb1477a6ecf1c948f47cad497c0a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(spyder-kernels) python311-spyder-kernels python3dist(spyder-kernels)"
RDEPENDS:${PN} += "(python311-ipykernel >= 6.16.1 with python311-ipykernel < 7) (python311-ipython >= 7.31.1 with python311-ipython < 9) (python311-jupyter_client >= 7.4.9 with python311-jupyter_client < 9) python(abi) python311-cloudpickle python311-pyzmq python311-wurlitzer"

inherit rpm
