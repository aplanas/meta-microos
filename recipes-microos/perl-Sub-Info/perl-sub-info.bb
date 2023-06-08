SUMMARY = "Tool for inspecting subroutines"
DESCRIPTION = "Tool to inspect subroutines."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Sub-Info-0.002-1.23.noarch.rpm"
RPM_HASH = "f1308501083cade26f3716f3d9de2064287bc821a2c9d2364f9353c0a870bf807912315143210477fa81f1f9bc13fe8a5ac1b2b332babacd28cdabb00456864d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Sub::Info) perl-Sub-Info"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Importer)"

inherit rpm
