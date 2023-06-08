SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-nbsphinx-0.9.1-1.2.noarch.rpm"
RPM_HASH = "9d779615444364f24f39f0f524413354ac39064192dc6cd46d89f3fac9d9309aecd41b575a88b8b9a260d62f480cca3df01ed212aeecdd6ec5535a02428eb3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbsphinx) python39-jupyter_nbsphinx python39-nbsphinx python3dist(nbsphinx)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2 python39-Sphinx python39-docutils python39-nbconvert python39-nbformat python39-sphinx_rtd_theme python39-traitlets"

inherit rpm
