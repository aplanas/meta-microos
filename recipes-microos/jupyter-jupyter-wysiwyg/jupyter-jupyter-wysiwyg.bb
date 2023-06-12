SUMMARY = "WYSIWYG editing functionality for markdown/HTML cells in Jupyter"
DESCRIPTION = "This is an nbextension that enables WYSIWYG editing functionality for \
HTML/Markdown cells in Jupyter."
LICENSE = "BSD-3-Clause"

PV = "19.10"

RPM_NAME = "jupyter-jupyter-wysiwyg-19.10-2.19.noarch.rpm"
RPM_HASH = "47a889d3d6a69c6113558068d3e5ce27d88f74f8edf313e84e2c82fb81910282b8f0d77019e7f6f885e03858da4afba9caeb517417bca2ae544487c4f213b0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jupyter-jupyter-wysiwyg) \
jupyter-jupyter-wysiwyg \
python3-jupyter-wysiwyg \
python3-jupyter_wysiwyg \
python3.10dist(jupyter-wysiwyg) \
python3dist(jupyter-wysiwyg)"
RDEPENDS:${PN} += "/bin/sh \
jupyter-notebook \
python(abi)"

inherit rpm
