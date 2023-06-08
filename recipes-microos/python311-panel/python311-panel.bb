SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python311-panel-0.14.4-1.1.noarch.rpm"
RPM_HASH = "a4b5a01c5799b92ed60fbf253e67119f91e3987871c6a219a4dc5e92fbfc58ac4ace3ea8e9f34cf59aa5b8fce009f94cb7681d95001938582b9eefa4bf24481d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(panel) python311-panel python3dist(panel)"
RDEPENDS:${PN} += "(python311-bokeh >= 2.4.3 with python311-bokeh < 2.5) /bin/sh /usr/bin/python3.11 jupyter-panel python(abi) python311-Markdown python311-bleach python311-param python311-pyct python311-pyviz-comms python311-requests python311-setuptools python311-tqdm python311-typing_extensions update-alternatives"

inherit rpm
