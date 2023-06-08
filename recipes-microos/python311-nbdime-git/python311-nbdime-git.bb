SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python311-nbdime-git-3.2.0-11.1.noarch.rpm"
RPM_HASH = "e3a69edbec2c1389250eea52726f787a10dcc42509cd31224ab2b27b21699b67d6ab7104093c7f1f9201157e8096f4cc656f443171304cf42fd152136d7c2c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyter_nbdime-git python311-nbdime-git"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts git-core python311-nbdime"

inherit rpm
