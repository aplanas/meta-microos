SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python310-bokeh-3.0.3-1.4.noarch.rpm"
RPM_HASH = "fc9f7f2769754d19e57f99332e043fb5d32162becbf605475eb8fcf3b69f44cca940fbedbd9bbd9e87cfb6546aa7bd5dffbf8709d66691a1e5ab5a578e67febd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh python3.10dist(bokeh) python310-bokeh python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Jinja2 python310-Pillow python310-PyYAML python310-base python310-contourpy python310-numpy python310-packaging python310-pandas python310-tornado python310-xyzservices update-alternatives"

inherit rpm
