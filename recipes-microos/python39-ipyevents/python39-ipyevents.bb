SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-ipyevents-2.0.1-5.3.noarch.rpm"
RPM_HASH = "9b12860bcf60ac1baf5070ec7bc184078ca5698c3ac0b8360498d83428a7408a1b7d953906c68e6ec550f26dbbdca2673e2ebd1a57e2d916978d30dcb372eae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyevents) python39-ipyevents python3dist(ipyevents)"
RDEPENDS:${PN} += "jupyter-ipyevents python(abi) python39-ipywidgets"

inherit rpm
