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

RPM_NAME = "python310-jupyter-1.0.0-11.1.noarch.rpm"
RPM_HASH = "215522cc74196c6703be60bf11c9517f1d654078d679a414e2b70fd3b58e4c64cc877cc12507f2bd63dc1d911d2c8a116dde10e3a42bdf78daa51d2b773845ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter python3-jupyter python3.10dist(jupyter) python310-jupyter python3dist(jupyter)"
RDEPENDS:${PN} += "python(abi) python310-ipykernel python310-ipywidgets python310-jupyter-core python310-jupyter_console python310-nbconvert python310-notebook python310-qtconsole"

inherit rpm
