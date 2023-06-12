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

RPM_NAME = "python39-jupyter-1.0.0-12.1.noarch.rpm"
RPM_HASH = "cc0716403e9e448d4e1d7fd83e478d2beb91ae8c588cffa355581e0f85727541fda4b26c5616fafa2c838c00c75b6061c27b5832326477cea111455f9ce3b640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter) \
python39-jupyter \
python3dist(jupyter)"
RDEPENDS:${PN} += "python(abi) \
python39-ipykernel \
python39-ipywidgets \
python39-jupyter-core \
python39-jupyter_console \
python39-nbconvert \
python39-notebook \
python39-qtconsole"

inherit rpm
