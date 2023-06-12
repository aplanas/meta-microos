SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-lo-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "f97f465ad86e007dcf46330ba13b29d7678084144ec3e0cbd6473be8e5f64c22c25f16780da40d7703fbd704d79bc8a32160a8011922ae005c35e64ae9490fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lo) \
yast2-trans-lo"
RDEPENDS:${PN} += ""

inherit rpm
