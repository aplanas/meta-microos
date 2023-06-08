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

RPM_NAME = "python39-nbval-0.10.0-1.3.noarch.rpm"
RPM_HASH = "40e133957edba6d3e6c7363dfb66910f8d0b22db7406406d084ddf4b8c986912061a01cfda04e79583d3a7bb66708fd10f21f656edefe89205231a70cb85936e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbval) python39-jupyter_nbval python39-nbval python3dist(nbval)"
RDEPENDS:${PN} += "python(abi) python39-coverage python39-ipykernel python39-jupyter-client python39-nbformat python39-pytest"

inherit rpm
