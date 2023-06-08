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

RPM_NAME = "python39-importlib-resources-5.12.0-1.1.noarch.rpm"
RPM_HASH = "360c2fa21d3e174635aea0ae476e5864b7e7ea90606ff8a83515fa49bb5ee57da3f1ceac1bdeca7d03d131a3a2e96ba27b5cc3b68a8bcff47df064c47050069c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(importlib-resources) python39-importlib-resources python39-importlib_resources python3dist(importlib-resources)"
RDEPENDS:${PN} += "python(abi) python39-zipp"

inherit rpm
