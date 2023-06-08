SUMMARY = "Supportconfig Analysis Patterns for HAE"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of High Availability Extension (HAE) \
clustering \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "sca-patterns-hae-1.5.2-1.2.noarch.rpm"
RPM_HASH = "67baa0f6171a27328bbafb4fed0265ee9883ff32081a7ec3c2a1c5bc595b945a2298a0721cc5cada1406c8f5997e1b606f2e591291cf5c43561ae79dd838b166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-hae"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/python3 sca-patterns-base sca-server-report"

inherit rpm
