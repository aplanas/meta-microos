SUMMARY = "Data files for KDE Education Applications"
DESCRIPTION = "This package contains common data files used by various KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdeedu-data-23.04.0-1.1.noarch.rpm"
RPM_HASH = "1ad7a28434304bc04594c3b297f2f5730da641017b55661b641665e3bd11427728d61f5e1f438375427433e20ad3094b9b4e7d1de5a3a04c69ba7b1736c57113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeedu-data libkdeedu4-data libkeduvocdocument-data"
RDEPENDS:${PN} += ""

inherit rpm
