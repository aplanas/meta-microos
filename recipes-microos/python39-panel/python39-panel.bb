SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python39-panel-0.14.4-1.1.noarch.rpm"
RPM_HASH = "be9d44ca9720ca608f6e4967f0a18349a85b48d042272f13ae88aff1acf8cc67729b7b3f59fefa61c38b91778cb0542cfdd07b835db125619068e2b79ace11c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(panel) python39-panel python3dist(panel)"
RDEPENDS:${PN} += "(python39-bokeh >= 2.4.3 with python39-bokeh < 2.5) /bin/sh /usr/bin/python3.9 jupyter-panel python(abi) python39-Markdown python39-bleach python39-param python39-pyct python39-pyviz-comms python39-requests python39-setuptools python39-tqdm python39-typing_extensions update-alternatives"

inherit rpm
