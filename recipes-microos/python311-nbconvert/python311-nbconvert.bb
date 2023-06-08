SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.3.1"

RPM_NAME = "python311-nbconvert-7.3.1-2.1.noarch.rpm"
RPM_HASH = "97c18cd8667cff08cf6d24214d3afa6a5134de95640b231f552d568fa172bb05385c4b35a8290ad169be6d1cff42b5c2c9aaa5eeefaae9e41e406cf64e80bc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbconvert) python311-jupyter_nbconvert python311-nbconvert python3dist(nbconvert)"
RDEPENDS:${PN} += "(python311-mistune >= 2.0.3 with python311-mistune < 3) /bin/sh /usr/bin/python3.11 alts jupyter-nbconvert python(abi) python311-Jinja2 python311-MarkupSafe python311-Pygments python311-beautifulsoup4 python311-bleach python311-defusedxml python311-jupyter-core python311-jupyterlab-pygments python311-lxml python311-nbclient python311-nbformat python311-packaging python311-pandocfilters python311-tinycss2 python311-traitlets"

inherit rpm
