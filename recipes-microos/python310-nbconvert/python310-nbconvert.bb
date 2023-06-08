SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.3.1"

RPM_NAME = "python310-nbconvert-7.3.1-2.1.noarch.rpm"
RPM_HASH = "ef2293605ef21842ccac9b50eadbc5278056540b6f10af60310efe796a806b040b69a2cbe24dc9acda4688fc97c9fd7c1fb2de98c2d243c8d5dcafd82f720337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbconvert python3-nbconvert python3.10dist(nbconvert) python310-jupyter_nbconvert python310-nbconvert python3dist(nbconvert)"
RDEPENDS:${PN} += "(python310-mistune >= 2.0.3 with python310-mistune < 3) /bin/sh /usr/bin/python3.10 alts jupyter-nbconvert python(abi) python310-Jinja2 python310-MarkupSafe python310-Pygments python310-beautifulsoup4 python310-bleach python310-defusedxml python310-jupyter-core python310-jupyterlab-pygments python310-lxml python310-nbclient python310-nbformat python310-packaging python310-pandocfilters python310-tinycss2 python310-traitlets"

inherit rpm
