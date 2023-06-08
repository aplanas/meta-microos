SUMMARY = "Documentation files for libical-glib3"
DESCRIPTION = "Documentation files for libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib-doc-3.0.16-1.3.noarch.rpm"
RPM_HASH = "d6e1210e157818c95b4d02dc0c790e12cb5bfa06b03eb11ecd1881bfcd0692c8441b6b0dd0083a8765a057912de5e755bb8103adb1364efc2e9309874d474a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-glib-doc"
RDEPENDS:${PN} += ""

inherit rpm
