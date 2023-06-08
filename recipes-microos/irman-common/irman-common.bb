SUMMARY = "Common files for libirman"
DESCRIPTION = "Common files for libirman."
LICENSE = "LGPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "irman-common-0.5.2-5.12.aarch64.rpm"
RPM_HASH = "5b5356f9fba4e150c17929433d64fc90d2956c734f1ffe33e1c281d3066851994f3848c66d5013475ebfcc9deba3d08143fed432323495e36c391982348ac7b6"

RPROVIDES:${PN} += "config(irman-common) irman-common irman-common(aarch-64) libirman-common"
RDEPENDS:${PN} += ""

inherit rpm
