SUMMARY = "Additional colors for lite-xl"
DESCRIPTION = "Color themes for the Lite XL text editor, originally forked from the lite colors repository."
LICENSE = "MIT"

PV = "git20221219.b3a9cdd"

RPM_NAME = "lite-xl-colors-git20221219.b3a9cdd-1.2.noarch.rpm"
RPM_HASH = "a53edaf3a7e4132cc799d6385c0af0171548e899b20df848eee5fb2886bb4b9b1a25e47ff4ac8510087cc7289bf02d857f801269822c15b1ff1f92479ccb5c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lite-xl-colors"
RDEPENDS:${PN} += "lite-xl"

inherit rpm
