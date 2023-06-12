SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "python3-firewall-1.3.2-2.1.noarch.rpm"
RPM_HASH = "d850b13426c4dc4d058e23f58e47098bd552a2cd5ca4e18193a2c10b56c8ba71cc4ae6ee051cef7c7ad6f0a409fcd49aeb2ff408dccf35facc51447663dc3705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-firewall"
RDEPENDS:${PN} += "dbus-1-python3 python(abi) python3-decorator python3-gobject python3-slip-dbus typelib(GLib) typelib(Gio) typelib(NM)"

inherit rpm
