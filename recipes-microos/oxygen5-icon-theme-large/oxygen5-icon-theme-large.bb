SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the large (128x128 and larger) non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "oxygen5-icon-theme-large-5.105.0-1.1.noarch.rpm"
RPM_HASH = "e0bc33c3fbd21d63480d55af013f0f0da40cad64088cd6a9bb92f8489ebe318ec3ac7ea9568b574b34998e5177877eba13edd93e3fe4821f373c26be6d56e111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-large oxygen5-icon-theme-large"
RDEPENDS:${PN} += "oxygen5-icon-theme"

inherit rpm
