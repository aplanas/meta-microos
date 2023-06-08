SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-nbsphinx-0.9.1-1.2.noarch.rpm"
RPM_HASH = "0545bf49953a3f06dc561a2b2c0022a09d95e2ba7ba80e31b3b91be80e11ba47adfd1311dea600abd0c6b63c6872e0c31811a3ecb493c5261ed4e9807d8f6c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbsphinx) python311-jupyter_nbsphinx python311-nbsphinx python3dist(nbsphinx)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-Sphinx python311-docutils python311-nbconvert python311-nbformat python311-sphinx_rtd_theme python311-traitlets"

inherit rpm
