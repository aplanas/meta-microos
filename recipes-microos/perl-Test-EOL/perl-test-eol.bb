SUMMARY = "Check the correct line endings in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-EOL-2.02-1.11.noarch.rpm"
RPM_HASH = "7e3fb909f583de28b932ebcc7730592d397da2dd36dadee32ba75fdaecbba4d5f50065f9948f395a9504738b78815ef3f2ed084274faa42527f5f08cf79914c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::EOL) perl-Test-EOL"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
