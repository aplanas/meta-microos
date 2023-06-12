SUMMARY = "Documentation for python-py2pack"
DESCRIPTION = "Documentation and help files for python-py2pack."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python-py2pack-doc-0.9.0-1.1.noarch.rpm"
RPM_HASH = "f2ae3d86e958e5add970bfed8db85430f7720823e4eec9c279e63f2740ed59f618bd5a1b8fcc1e4e8b1875c35ff8efde78c89130a907cf5f76d80c80b3b3c97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-py2pack-doc \
python310-py2pack-doc \
python311-py2pack-doc \
python39-py2pack-doc"
RDEPENDS:${PN} += ""

inherit rpm
