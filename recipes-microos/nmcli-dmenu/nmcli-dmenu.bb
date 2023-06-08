SUMMARY = "Control NetworkManager via dmenu"
DESCRIPTION = "Small script to manage NetworkManager connections with dmenu instead of \
nm-applet. It can connect to existing NetworkManager wifi or wired connections, \
connect to new wifi connections (requests passphrase if required), connect to \
existing VPN connections, enable/disable networking, launch \
nm-connection-editor GUI."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "nmcli-dmenu-1.0.0-1.16.noarch.rpm"
RPM_HASH = "1bc9f4376a77267a4154640dcdf393faf391c6a27b9c6502ec00691c23362117dd51b8a9a777c8fbe330d8dc5028abcb32daf6149b98cb05fe947068f53e3b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(nmcli_dmenu.desktop) nmcli-dmenu"
RDEPENDS:${PN} += "/usr/bin/env NetworkManager dmenu"

inherit rpm
