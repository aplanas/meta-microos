SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python311-nodeenv-1.7.0-1.5.noarch.rpm"
RPM_HASH = "7c6a720c546087bf658b222dcc6f992544af8af0df28f58ca4fe8aad3e26c384f9636d140f7ae815de0adfab29cc460caafb75696b7b9451ec5dfdd73e19f1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nodeenv) \
python311-nodeenv \
python3dist(nodeenv)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
