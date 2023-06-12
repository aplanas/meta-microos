SUMMARY = "Nano syntax highlighting for icinga2"
DESCRIPTION = "Provides Nano syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "nano-icinga2-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "cb2a7d756e1f7447749ef8bab72b29868bb4b1809b4b7191f7013782d836b4e73e4a2fc0368f017a3d1224810db236dd82579003a49307d011a76ae52677e36e"

RPROVIDES:${PN} += "nano-icinga2 \
nano-icinga2(aarch-64)"
RDEPENDS:${PN} += "nano"

inherit rpm
