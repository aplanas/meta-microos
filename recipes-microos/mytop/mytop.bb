SUMMARY = "A top Clone for MySQL"
DESCRIPTION = "mytop is a console-based (non-GUI) tool for monitoring the threads and \
overall performance of MySQL 3.22.x, 3.23.x, and 4.x servers. \
 \
- With Term::ANSIColor installed you even get color. \
 \
- If you install Time::HiRes, get good real-time queries/second stats."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "mytop-1.6-104.26.noarch.rpm"
RPM_HASH = "8ffb9d0ad9ffd27b1d0a8bd9d644e379443979c1ee70510868df4d5462d05b4542000f408f29c41fa4f87e38089d641a309ef86d2a36a5d2a35e13c4ba2f7728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mytop"
RDEPENDS:${PN} += "/usr/bin/perl perl perl-DBD-mysql perl-DBI perl-TermReadKey"

inherit rpm
