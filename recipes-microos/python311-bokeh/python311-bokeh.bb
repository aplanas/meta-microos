SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "python311-bokeh-3.0.3-1.4.noarch.rpm"
RPM_HASH = "f6293b4fc39febc38d5c501bc64153949223ab3a82518f1ce4c40d04bc13e5886cd8fdad606c00f84f57a5a53482c26dacc775dfdf4f9fe96ded8c7781ae04d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bokeh) python311-bokeh python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-Pillow python311-PyYAML python311-base python311-contourpy python311-numpy python311-packaging python311-pandas python311-tornado python311-xyzservices update-alternatives"

inherit rpm
