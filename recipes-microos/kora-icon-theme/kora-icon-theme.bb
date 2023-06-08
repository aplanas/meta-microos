SUMMARY = "SVG icon theme suitable for every desktop environment (dark and light versions, HiDPI support)"
DESCRIPTION = "Kora is an SVG icon theme with lots of new icons for GNU/Linux operating systems. \
 \
To make them display properly, you may need to update the icon cache. A script is included. \
 \
Different versions available: \
kora - for dark themes with dark panel \
kora-light - for light themes with dark panel (depends on Kora) \
kora-light-panel - for light themes with light panel (depends on Kora and Kora-light) \
kora-pgrey - theme with grey folder colors (depends on Kora)"
LICENSE = "GPL-3.0"

PV = "1.5.6"

RPM_NAME = "kora-icon-theme-1.5.6-1.1.noarch.rpm"
RPM_HASH = "25f0b1a724bb339627b9592fcfea6ee3d964824b70ea3451f0dc2f4e31518dca2e250fba21f4ee3fc1153848c135a7796a488e470a51354da0d95d5533689302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kora-icon-theme"
RDEPENDS:${PN} += "gtk3-tools"

inherit rpm
