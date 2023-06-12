SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-nbdime-git-3.2.1-12.2.noarch.rpm"
RPM_HASH = "daec61b6f037b90728f6e1b4fd0c82b99afd3f4f4f6779c97d9ced7f38314bf4dc10bf6dd569cad2ea018a8fd9a6762886c7969cf211ff9d2f618e790de9c00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter_nbdime-git python311-nbdime-git"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts git-core python311-nbdime"

inherit rpm
