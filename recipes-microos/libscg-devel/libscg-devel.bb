SUMMARY = "Development files for libscg, a SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction layer \
from operating systems' mechanisms to issue SCSI commands. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libscg."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscg-devel-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "75ad2b0de68bf8946e256d19c3f68a0280d2ef693f882f214b2dffd2998692afac05a3364710e40c52aedb3e991a81b4eca8991a97a4397edc080eaa384dce7a"

RPROVIDES:${PN} += "libscg-devel libscg-devel(aarch-64)"
RDEPENDS:${PN} += "librscg1_0 libscg1_0 libscgcmd1_0 libschily-devel"

inherit rpm
