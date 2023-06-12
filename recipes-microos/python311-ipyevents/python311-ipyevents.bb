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

RPM_NAME = "python311-ipyevents-2.0.1-5.3.noarch.rpm"
RPM_HASH = "59a37fd694da2290024e9f906e67bad879aca341fbfdcd9d8983a3dd245b1c6172bcfe468e0caef41ce2da83dd6366f7f5a9ed18ffda760958c1490bce009bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyevents) \
python311-ipyevents \
python3dist(ipyevents)"
RDEPENDS:${PN} += "jupyter-ipyevents \
python(abi) \
python311-ipywidgets"

inherit rpm
