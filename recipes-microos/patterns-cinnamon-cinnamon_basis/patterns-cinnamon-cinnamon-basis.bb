SUMMARY = "Cinnamon Base System"
DESCRIPTION = "Base packages for the cinnamon Desktop Environment"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "202021205"

RPM_NAME = "patterns-cinnamon-cinnamon_basis-202021205-2.7.aarch64.rpm"
RPM_HASH = "abe1e27d984ce9c20d67157a8407f643e1fe4b6707fd7f1a31398e4226a72b0a497c0ba798c65191585e5a26454383ee32602f21f6a6f30c021b8e019835379c"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-cinnamon-cinnamon_basis patterns-cinnamon-cinnamon_basis(aarch-64) patterns-openSUSE-cinnamon_basis"
RDEPENDS:${PN} += "cinnamon cinnamon-control-center cinnamon-screensaver cinnamon-session cinnamon-settings-daemon cjs pattern()"

inherit rpm
