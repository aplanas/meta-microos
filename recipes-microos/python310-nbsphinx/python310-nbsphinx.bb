SUMMARY = "Jupyter Notebook Tools for Sphinx"
DESCRIPTION = "The nbsphinx package is a Sphinx extension that provides a source \
parser for *.ipynb files. Custom Sphinx directives are used to show \
Jupyter Notebook code cells (and of course their results) in both HTML \
and LaTeX output. Un-evaluated notebooks – i.e. notebooks without \
stored output cells – will be automatically executed during the Sphinx \
build process."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-nbsphinx-0.9.2-1.1.noarch.rpm"
RPM_HASH = "45e09ae48ef0dead5730505962a2278cb8fcb5cc1421682ade39af57d3d9e4292ed4de40541bc4cdf23893f9d9983a857e561078485e9c13b9164995e443c36f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsphinx \
python3-jupyter_nbsphinx \
python3-nbsphinx \
python3.10dist(nbsphinx) \
python310-jupyter_nbsphinx \
python310-nbsphinx \
python3dist(nbsphinx)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-Sphinx \
python310-docutils \
python310-nbconvert \
python310-nbformat \
python310-traitlets"

inherit rpm
