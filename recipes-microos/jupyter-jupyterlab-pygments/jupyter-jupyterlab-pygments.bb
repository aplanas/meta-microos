SUMMARY = "Pygments theme for jupyterlab -- Jupyterlab extension files"
DESCRIPTION = "This package contains the Jupyterlab extension files for python-jupyterlab-pygments"
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "jupyter-jupyterlab-pygments-0.2.2-3.3.noarch.rpm"
RPM_HASH = "75b1fe917b9e9392072571ef847979d2cc34439a56a0ea66fcfa9cf7018a15ac71530708691572d493d730a4124bbd0077e7fcb927c40c1dfd0007a04b96873b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-pygments"
RDEPENDS:${PN} += ""

inherit rpm
