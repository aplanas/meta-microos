SUMMARY = "A bootstrapping and management tool for k0s clusters"
DESCRIPTION = "k0sctl is a bootstrapping and management tool for k0s clusters."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "k0sctl-0.12.2-1.8.aarch64.rpm"
RPM_HASH = "2246fc8ea09369838cb860ad1cc9ceca695bccff1811abfcd3ca9a1368ba7c7a803bf7bac7cc06dd64a764c00d719a0618196f1bad9d11e8276b282ac0beba9b"

RPROVIDES:${PN} += "k0sctl k0sctl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
