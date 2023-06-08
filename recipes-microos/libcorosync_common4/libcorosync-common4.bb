SUMMARY = "The Corosync Cluster Engine library"
DESCRIPTION = "This package contains the central Corosync library."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcorosync_common4-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "c284f86b50a2f2f731b6c2e0fd2dd8b2aeeae2889e920bec9069c61bb520bbaf7b728952f6235cbbe9ea52490837182dddd3bcd0393e852c1063350801bfb816"

RPROVIDES:${PN} += "libcorosync4 libcorosync_common.so.4()(64bit) libcorosync_common4 libcorosync_common4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
