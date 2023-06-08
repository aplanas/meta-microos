SUMMARY = "Zope Location"
DESCRIPTION = "This package contains documentation files for python-zope.i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python-zope.i18nmessageid-doc-6.0.1-1.1.noarch.rpm"
RPM_HASH = "e0cbf0fdd1fa105e0098c7dc6f990444201b5d45a6f1038077448e380beeea301d5d187a35a90a1a859cc097e42a3d086cdae58b970322b2db9b9c8c2f4d61d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.i18nmessageid-doc python310-zope.i18nmessageid-doc python311-zope.i18nmessageid-doc python39-zope.i18nmessageid-doc"
RDEPENDS:${PN} += ""

inherit rpm
