SUMMARY = "IPython-enabled pdb"
DESCRIPTION = "ipdb exports functions to access the IPython_ debugger, which features \
tab completion, syntax highlighting, better tracebacks, better \
introspection with the same interface as the `pdb` module."
LICENSE = "BSD-3-Clause"

PV = "0.13.13"

RPM_NAME = "python39-ipdb-0.13.13-1.2.noarch.rpm"
RPM_HASH = "32900717ef4dce99f6aefdc6882272ac57aff0ba0743fe537483ecd6a6fb9daf403210c387513791bab6512d8044386413d60f73292c615ef13bdd76a858ac38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipdb) \
python39-ipdb \
python39-jupyter_ipdb \
python3dist(ipdb)"
RDEPENDS:${PN} += "(python39-ipython >= 7.16.3 if python39-base < 3.7) \
(python39-ipython >= 7.31.1 if python39-base >= 3.7) \
(python39-tomli if python39-base < 3.11) \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-decorator \
update-alternatives"

inherit rpm
