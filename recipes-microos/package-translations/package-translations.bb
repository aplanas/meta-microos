SUMMARY = "Summary and Descriptions Translations"
DESCRIPTION = "This package provides translations for our packages. You don't want to install this \
package on your system, it's only useful when you create openSUSE media."
LICENSE = "BSD-3-Clause"

PV = "89.87.20230417.43910d3"

RPM_NAME = "package-translations-89.87.20230417.43910d3-1.1.noarch.rpm"
RPM_HASH = "6c8993b892ad446988fc70d30ffef346e66fc86376fac6b1411c8d53d7ab55b19271a87c5cd99edd8e75f39ccb83d0720199443d1112630292ffc09575c58406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "package-translations"
RDEPENDS:${PN} += ""

inherit rpm
