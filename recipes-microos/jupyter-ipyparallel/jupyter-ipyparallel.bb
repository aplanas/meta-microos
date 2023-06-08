SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "jupyter-ipyparallel-8.6.1-1.1.noarch.rpm"
RPM_HASH = "2b94c3f0e0d9f0122614346238faac93d86f2e46f1fec89bfa41197955b1c93a01a9456cf8e8aeca284803e2d7698bf0cc43b46d8624279b6a4ccc9deeab80d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyparallel jupyter-ipyparallel-l jupyter-ipyparallel-nbext jupyter-ipyparallel-serverextension"
RDEPENDS:${PN} += "jupyter-jupyter-core jupyter-jupyter-server jupyter-jupyterlab jupyter-notebook python3-ipyparallel"

inherit rpm
