SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python39-flufl.bounce-4.0-3.3.noarch.rpm"
RPM_HASH = "f12ff936ba3b284399a1cb0340e0cb2d1ae4441d1b55c0f2387e1ee69f3d2aa8b38e638114dae9e1db6fe742eb5a037e4b6f53a82eafc7513507ada3a53e28be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flufl.bounce) python39-flufl.bounce python3dist(flufl.bounce)"
RDEPENDS:${PN} += "python(abi) python39-atpublic python39-zope.interface"

inherit rpm
