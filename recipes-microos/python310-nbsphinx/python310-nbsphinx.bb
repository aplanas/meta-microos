SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-nbsphinx-0.9.1-1.2.noarch.rpm"
RPM_HASH = "2b5dc1ee8306480d40e97b0055ea91faeef9520897aa70b03207eda8c62fc5e00e1c2aeec5b0ebe31b76fc26ad400ae2b577f577ba94bc2a155c7a4df4a8b8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsphinx python3-jupyter_nbsphinx python3-nbsphinx python3.10dist(nbsphinx) python310-jupyter_nbsphinx python310-nbsphinx python3dist(nbsphinx)"
RDEPENDS:${PN} += "python(abi) python310-Jinja2 python310-Sphinx python310-docutils python310-nbconvert python310-nbformat python310-sphinx_rtd_theme python310-traitlets"

inherit rpm
