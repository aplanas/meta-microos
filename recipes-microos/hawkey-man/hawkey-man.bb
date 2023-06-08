SUMMARY = "Documentation for the hawkey Python bindings"
DESCRIPTION = "This package provides the man pages for the hawkey Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "hawkey-man-0.70.0-1.3.noarch.rpm"
RPM_HASH = "b28a6d94047bf474e31d8389bfb3d2802f8a972f1264ffec7cef514663270d2feb5a5fccff60909013cbd86d369d61465f1d8de758328e61ead49b45f3a21146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawkey-man"
RDEPENDS:${PN} += ""

inherit rpm
