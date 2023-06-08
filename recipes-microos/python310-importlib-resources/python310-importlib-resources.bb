SUMMARY = "Read resources from Python packages"
DESCRIPTION = "importlib_resources is a backport of Python standard library \
importlib.resources module for older Pythons. Users of Python 3.9 and \
beyond should use the standard library module, since for these versions, \
importlib_resources just delegates to that module. \
 \
The key goal of this module is to replace parts of pkg_resources with a \
solution in Python’s stdlib that relies on well-defined APIs. This makes \
reading resources included in packages easier, with more stable and \
consistent semantics."
LICENSE = "Apache-2.0"

PV = "5.12.0"

RPM_NAME = "python310-importlib-resources-5.12.0-1.1.noarch.rpm"
RPM_HASH = "9578f4b1e6704a076b3826a50b8d1d34f70c7822c03baa78e2f9b1c1eee82dd9f1888ce62918a44932c6825ee9919d6bace6da6ac72045dc7a0b46a337dd59c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-resources python3-importlib_resources python3.10dist(importlib-resources) python310-importlib-resources python310-importlib_resources python3dist(importlib-resources)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
