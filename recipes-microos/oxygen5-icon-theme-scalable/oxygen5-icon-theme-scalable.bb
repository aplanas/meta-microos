SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "oxygen5-icon-theme-scalable-5.105.0-1.1.noarch.rpm"
RPM_HASH = "865e3b7b38a2d3fe3435be82c39afb16e802f801a0c252e3cbd6ecb220f880963827f5c98f8a9101e2cccb5b098e958ab55c83ecae9b6a1da5fd1f9942be2efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-scalable oxygen5-icon-theme-scalable"
RDEPENDS:${PN} += "/bin/bash oxygen5-icon-theme"

inherit rpm
