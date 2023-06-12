SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "oxygen5-icon-theme-scalable-5.106.0-1.1.noarch.rpm"
RPM_HASH = "49a768cc0f2d43150280f3bb9495e4131733b75dad815f90e9ab07b8fa8a7d1ccbe8885931e3d1f854f0dff9917707b65515d78a2d62e80ba1d0ce53eec05469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-scalable oxygen5-icon-theme-scalable"
RDEPENDS:${PN} += "/bin/bash oxygen5-icon-theme"

inherit rpm
