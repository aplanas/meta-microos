SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python39-nbdime-hg-3.2.0-11.1.noarch.rpm"
RPM_HASH = "645457655e4106e091db05c685d9c6526665f985903b5b3a26374316b2bfce9e612e3dbeefe71c02a0537adbbfa3e81a0a81c466672ed8611106a9dc6a6e8f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter_nbdime-hg python39-nbdime-hg"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts mercurial python39-nbdime"

inherit rpm
