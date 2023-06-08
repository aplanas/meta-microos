SUMMARY = "Javadoc for saxon8"
DESCRIPTION = "Javadoc for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-javadoc-B.8.8-133.6.noarch.rpm"
RPM_HASH = "bf40e058bb5670391cae2b7efef06b6aa657f2262a2795597f703431d94b4d323d7a953026c84de27f341f7f60d1e3b12d506a0c98c2be395e866cfa9cf8f684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
