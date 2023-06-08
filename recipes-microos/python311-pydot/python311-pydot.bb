SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-pydot-1.4.2-2.9.noarch.rpm"
RPM_HASH = "28bbd583fe93ea192f11fdac59d972940e16e7b7b9e20e51155aec53a6788b872da99b7ae1a2f3c9a64c337daa946b6da3b548c537cf9c9e075b2bd7b06dbcb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydot) python311-pydot python3dist(pydot)"
RDEPENDS:${PN} += "dejavu-fonts graphviz graphviz-gd python(abi) python311-pyparsing"

inherit rpm
