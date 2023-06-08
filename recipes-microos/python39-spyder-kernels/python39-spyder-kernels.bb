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

RPM_NAME = "python39-spyder-kernels-2.4.3-1.1.noarch.rpm"
RPM_HASH = "f7c884fa884bd8a6e8672dd338f848d2d5e46cdca0170f76b0390bb8635e591b92b544062340a131c58df1279e3354e9a8003edbb0fb69210c8aa25da3fd7020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(spyder-kernels) python39-spyder-kernels python3dist(spyder-kernels)"
RDEPENDS:${PN} += "(python39-ipykernel >= 6.16.1 with python39-ipykernel < 7) (python39-ipython >= 7.31.1 with python39-ipython < 9) (python39-jupyter_client >= 7.4.9 with python39-jupyter_client < 9) python(abi) python39-cloudpickle python39-pyzmq python39-wurlitzer"

inherit rpm
