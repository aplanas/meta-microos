SUMMARY = "Proton VPN NetworkManager library"
DESCRIPTION = "The Proton VPN NetworkManager library"
LICENSE = "GPL-3.0-or-later"

PV = "3.14.0"

RPM_NAME = "python39-protonvpn-nm-lib-3.14.0-1.4.noarch.rpm"
RPM_HASH = "137924632acd08e9109a5b7a0c9b849a36825b908613aef28bdf08f9d20ed92e81c5787c98a209d1553c298136a6affc6d9214c9cce5045223827cb382988756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(protonvpn-nm-lib) python39-protonvpn-nm-lib python3dist(protonvpn-nm-lib)"
RDEPENDS:${PN} += "NetworkManager-openvpn dbus-1-x11 python(abi) python39-Jinja2 python39-dbus-python python39-distro python39-gobject python39-keyring python39-proton-client python39-pyxdg python39-systemd typelib(GLib) typelib(NM)"

inherit rpm
