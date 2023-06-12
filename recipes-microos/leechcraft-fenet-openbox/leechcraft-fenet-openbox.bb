SUMMARY = "OpenBox Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Openbox Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-openbox-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "6721ad433133837a46c84c5c601967bcb627a16118a9e7947607aa8047ad9faa460b99ffb6135242c8b1113cf058e82fe3d99c6d3e15e792d0b2dd63b84ee4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-openbox \
leechcraft-fenet-wm"
RDEPENDS:${PN} += "/bin/sh \
leechcraft-fenet \
openbox"

inherit rpm
