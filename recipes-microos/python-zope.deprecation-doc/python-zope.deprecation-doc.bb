SUMMARY = "Zope 3 Deprecation Infrastructure"
DESCRIPTION = "This package contains documentation files for python-zope.deprecation."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python-zope.deprecation-doc-5.0-1.1.noarch.rpm"
RPM_HASH = "9c64137fd47b32cddb14ea6d4482f4f419ecb470c771e211c96d0d5aaddc34068dddef46b760ee63969ae7e97d4552ad163b6dd0f0522a5088213671799c9df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.deprecation-doc python310-zope.deprecation-doc python311-zope.deprecation-doc python39-zope.deprecation-doc"
RDEPENDS:${PN} += ""

inherit rpm
