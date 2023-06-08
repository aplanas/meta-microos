SUMMARY = "Common development-files for libappmenu-gtk{2,3}-parser"
DESCRIPTION = "This package contains common headers and documentation for \
libappmenu-gtk{2,3}-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk-parser-devel-0.7.6-1.6.noarch.rpm"
RPM_HASH = "7702671f6f7ab8873cbb18ff8027bd8db12044866ffbedf9399c8c659cf5fe1642025aa1384c748b4285cd3b3c740da447957f9da4bddfc2086fa9c40eb5cba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libappmenu-gtk-parser-devel"
RDEPENDS:${PN} += ""

inherit rpm
