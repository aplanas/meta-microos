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

RPM_NAME = "python39-jupyter-1.0.0-11.1.noarch.rpm"
RPM_HASH = "a57696c8c52d60b573faa772da6c36be5634e4fbfee4d965516e7426da17ec540146833f7a7042de28fb43d1254210f186895a6c93afd1d3d216d75862ed75fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter) python39-jupyter python3dist(jupyter)"
RDEPENDS:${PN} += "python(abi) python39-ipykernel python39-ipywidgets python39-jupyter-core python39-jupyter_console python39-nbconvert python39-notebook python39-qtconsole"

inherit rpm
