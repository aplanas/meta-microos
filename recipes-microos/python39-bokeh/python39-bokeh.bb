SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python39-bokeh-3.0.3-1.4.noarch.rpm"
RPM_HASH = "132395e53e420e46b1e0b55a41e1ed2f562753ffe17d7731960c715cca44c6952b7e897e678b8ab9b85bed5c272704fbd7b4324e4491e49c7ff1c135879e4938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bokeh) python39-bokeh python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Jinja2 python39-Pillow python39-PyYAML python39-base python39-contourpy python39-numpy python39-packaging python39-pandas python39-tornado python39-xyzservices update-alternatives"

inherit rpm
