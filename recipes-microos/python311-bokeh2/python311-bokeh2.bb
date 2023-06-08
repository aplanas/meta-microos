SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets. \
 \
This package provides the version from the 2.4 branch until all consuming \
packages are ready for Bokeh 3."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python311-bokeh2-2.4.3-2.5.noarch.rpm"
RPM_HASH = "85e394237d3e470097fff3fe1f27e9091935a4ed54951e2e75de5040de92a70780ed54ede4063e4d377d5150b9574f92ab1fbb3e577a86b4ea2e893cb5a79a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bokeh) python311-bokeh python311-bokeh2 python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-Pillow python311-PyYAML python311-numpy python311-packaging python311-python-dateutil python311-tornado python311-typing_extensions update-alternatives"

inherit rpm
