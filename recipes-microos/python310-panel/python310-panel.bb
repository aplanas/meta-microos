SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python310-panel-0.14.4-1.1.noarch.rpm"
RPM_HASH = "7355f9c20897ba5cb049cfcb5edafa45ebcf56b7de2a87ca7818667b8b7eed35aee6903005e0af9a358ec713c6fd1bbde4a44158facfc324ca9cfb7274400b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panel python3.10dist(panel) python310-panel python3dist(panel)"
RDEPENDS:${PN} += "(python310-bokeh >= 2.4.3 with python310-bokeh < 2.5) /bin/sh /usr/bin/python3.10 jupyter-panel python(abi) python310-Markdown python310-bleach python310-param python310-pyct python310-pyviz-comms python310-requests python310-setuptools python310-tqdm python310-typing_extensions update-alternatives"

inherit rpm
