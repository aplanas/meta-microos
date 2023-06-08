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

RPM_NAME = "python311-jupyter-1.0.0-11.1.noarch.rpm"
RPM_HASH = "5243c1f053e9df2489fec184a34a86982a6aba40f341262e3b9e8be646c78018cfe16ef0068c45c964b83652b8c26bc170e989636fd0d5dcf5e8c3186532e90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter) python311-jupyter python3dist(jupyter)"
RDEPENDS:${PN} += "python(abi) python311-ipykernel python311-ipywidgets python311-jupyter-core python311-jupyter_console python311-nbconvert python311-notebook python311-qtconsole"

inherit rpm
