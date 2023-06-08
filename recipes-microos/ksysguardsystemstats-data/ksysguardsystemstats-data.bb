SUMMARY = "Data needed by libKSysGuardSystemStats"
DESCRIPTION = "Contains the unversioned D-Bus interface definition for KSystemStats plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "ksysguardsystemstats-data-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "39db4c92dae83831f39ef7c6e8daebffc5e325eddd2936f872aafc40544b3310494e75ddbaf6a53d7d09f92f8c474aa4a07fed15d48eb6547c0dfda93e9f4abf"

RPROVIDES:${PN} += "ksysguardsystemstats-data ksysguardsystemstats-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
