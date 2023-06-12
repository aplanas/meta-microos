SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python39-panel-0.14.4-1.2.noarch.rpm"
RPM_HASH = "8656578f93a50dc39e01b48f009fea64be9bd2579f82faba7e749b6be7a3bf75e48acef039a91c8bc30c7ae2947992f1e26db85961f59bdbd4ed28d8a0fbd051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(panel) python39-panel python3dist(panel)"
RDEPENDS:${PN} += "(python39-bokeh >= 2.4.3 with python39-bokeh < 2.5) /bin/sh /usr/bin/python3.9 jupyter-panel python(abi) python39-Markdown python39-bleach python39-param python39-pyct python39-pyviz-comms python39-requests python39-setuptools python39-tqdm python39-typing_extensions update-alternatives"

inherit rpm
