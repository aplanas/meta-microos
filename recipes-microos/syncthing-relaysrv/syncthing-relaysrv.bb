SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "1.23.4"

RPM_NAME = "syncthing-relaysrv-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "4a4b4b727437cc67695bfdda1e886fa1898f2f408e8d2b88e24bd09316e8446d417a51e735c35632518f9ef0656fd6b794f2d2cd36c1ba04a7f1e72e22d160fc"

RPROVIDES:${PN} += "syncthing-relaysrv syncthing-relaysrv(aarch-64)"
RDEPENDS:${PN} += "/bin/sh pwdutils"

inherit rpm
