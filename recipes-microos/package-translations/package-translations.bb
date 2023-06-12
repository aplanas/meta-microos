SUMMARY = "Summary and Descriptions Translations"
DESCRIPTION = "This package provides translations for our packages. You don't want to install this \
package on your system, it's only useful when you create openSUSE media."
LICENSE = "BSD-3-Clause"

PV = "89.87.20230508.84161a4"

RPM_NAME = "package-translations-89.87.20230508.84161a4-1.1.noarch.rpm"
RPM_HASH = "b94dbc9fe9acd7153c9cba425ced355b9d57dba8dbb4f99a5934bef4de892691e71604b6e5435229458418c390cec11a0caa25a0faa6c335ae1290088b03ba8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "package-translations"
RDEPENDS:${PN} += ""

inherit rpm
