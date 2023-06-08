SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "1.23.4"

RPM_NAME = "syncthing-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "5776a6d1e5a7e05ab4ac76c6c2c2b793b01b8ace9c26bdc87fd376cc4728f957d011e58c5411d30329fcda235d2d453f065e7814d0b06891db4313ca53c287e8"

RPROVIDES:${PN} += "application() application(syncthing-ui.desktop) syncthing syncthing(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
