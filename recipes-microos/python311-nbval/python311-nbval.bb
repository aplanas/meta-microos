SUMMARY = "A pytest plugin to validate Jupyter notebooks"
DESCRIPTION = "The plugin adds functionality to py.test to recognise and collect \
Jupyter notebooks. The intended purpose of the tests is to determine \
whether execution of the stored inputs match the stored outputs of \
the .ipynb file. Whilst also ensuring that the notebooks are running \
without errors. \
 \
The tests were designed to ensure that Jupyter notebooks (especially \
those for reference and documentation), are executing consistently. \
 \
Each cell is taken as a test, a cell that doesn't reproduce the \
expected output will fail."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-nbval-0.10.0-1.3.noarch.rpm"
RPM_HASH = "ff5508ea2d41a6b63006239ce679604906669302782f045746fe7559bff2d0ed30ba2db1b97f3da22785ac1b4814e4b51e0878ff7a508652abce9deb778c0915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbval) python311-jupyter_nbval python311-nbval python3dist(nbval)"
RDEPENDS:${PN} += "python(abi) python311-coverage python311-ipykernel python311-jupyter-client python311-nbformat python311-pytest"

inherit rpm
