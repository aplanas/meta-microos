SUMMARY = "Metapackage to install all the Jupyter components in one go"
DESCRIPTION = "Jupyter is an environment for interactive computing in multiple languages. \
It includes a console, a browser-based notebook format, and support for \
dozens of languages through the use of language-specific kernels. \
 \
Jupyter is an evolution and modularization of the IPython project, separating \
out the python3-specific parts from the language-agnostic parts. \
 \
This package pulls in the main Jupyter system, including the notebook, \
qtconsole, and the IPython kernel.  Additional components and kernels \
can be installed separately."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-jupyter-1.0.0-12.1.noarch.rpm"
RPM_HASH = "0a353ee832b8529db7515ef1be294a2e97a9f99917d9c20d9e05dd6fecdd477cca276f597999f06c1d41c15ae272cb71000a0a5bef63a981ca3da67263b2f0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter) python311-jupyter python3dist(jupyter)"
RDEPENDS:${PN} += "python(abi) python311-ipykernel python311-ipywidgets python311-jupyter-core python311-jupyter_console python311-nbconvert python311-notebook python311-qtconsole"

inherit rpm
