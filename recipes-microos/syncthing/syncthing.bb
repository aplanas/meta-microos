SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "1.23.4"

RPM_NAME = "syncthing-1.23.4-1.2.aarch64.rpm"
RPM_HASH = "ff2d5e65b06f5151eb1e8018e522853201d3e89b25185ca61c864529f6f3db02ec199780c2bf02f4a0ceb2d3fc18cc0e1cac0b18ec141438b253d27d00e25fa9"

RPROVIDES:${PN} += "application() application(syncthing-ui.desktop) syncthing syncthing(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
