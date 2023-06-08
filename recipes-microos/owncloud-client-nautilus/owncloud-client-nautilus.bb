SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nautilus file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "owncloud-client-nautilus-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "e20f8e6b7cb799ca2298dc60a80657b83f0db47e1887b99d12fecf2c50c33e84a6137cd1280caf5c5745f1c3b92f08395ad07ca85fe864d385eb6997f3581fe0"

RPROVIDES:${PN} += "owncloud-client-nautilus owncloud-client-nautilus(aarch-64)"
RDEPENDS:${PN} += "nautilus owncloud-client(aarch-64) python3-nautilus"

inherit rpm
