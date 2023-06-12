SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-nbsmoke-0.6.0-3.4.noarch.rpm"
RPM_HASH = "8033d9e2b31e05d9b35ac05e67b36c96fd80892c785657c83bae2d2c55afa054ebe25603eca888790a8b4be41e7851555a44d4884fb112959ce783708ddb59bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbsmoke) \
python311-jupyter_nbsmoke \
python311-nbsmoke \
python3dist(nbsmoke)"
RDEPENDS:${PN} += "python(abi) \
python311-ipykernel \
python311-jupyter-client \
python311-nbconvert \
python311-nbformat \
python311-param \
python311-pyflakes \
python311-pytest"

inherit rpm
