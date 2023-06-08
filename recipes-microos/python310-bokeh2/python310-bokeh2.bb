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

RPM_NAME = "python310-bokeh2-2.4.3-2.5.noarch.rpm"
RPM_HASH = "a6b6bfa45b0a0faadae7ab3234f7493ae9913638888c9ef455891f1d0d6fec88fabd1fdf02ebb36a6d987a5483e00b321d49ef3c655fdf27488a3d44c0fbcfe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh python3-bokeh2 python3.10dist(bokeh) python310-bokeh python310-bokeh2 python3dist(bokeh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Jinja2 python310-Pillow python310-PyYAML python310-numpy python310-packaging python310-python-dateutil python310-tornado python310-typing_extensions update-alternatives"

inherit rpm
