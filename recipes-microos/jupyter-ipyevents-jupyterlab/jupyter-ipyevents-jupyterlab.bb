SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "jupyter-ipyevents-jupyterlab-2.0.1-5.3.noarch.rpm"
RPM_HASH = "2cf19d9e4dda391656316d26c7588df335bd1b0479bae62ecae7b21625f62308de2088260d646fd4791f16d89a25a846de7bf68a60c4d65c06949158e6cebc0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents-jupyterlab"
RDEPENDS:${PN} += "jupyter-jupyterlab python3dist(ipyevents)"

inherit rpm
