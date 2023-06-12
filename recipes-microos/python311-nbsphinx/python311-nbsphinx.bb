SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-nbsphinx-0.9.2-1.1.noarch.rpm"
RPM_HASH = "7857516416a812cd3c939ef0a1d463204a3fb2a14aabff6bd98b3e36d1d07817b366a0e67101a937ba48b5ae6ef9b1fbd901f4267ab5d10ef88dc9f9e4a57255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbsphinx) \
python311-jupyter_nbsphinx \
python311-nbsphinx \
python3dist(nbsphinx)"
RDEPENDS:${PN} += "python(abi) \
python311-Jinja2 \
python311-Sphinx \
python311-docutils \
python311-nbconvert \
python311-nbformat \
python311-traitlets"

inherit rpm
