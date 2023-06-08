SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "python3-firewall-1.3.2-1.1.noarch.rpm"
RPM_HASH = "5c400e97812310fbabd033038ea2cb0d239433b77750a33481764664655c835daedaf08fbceaf0d06cf796ad6c225d430a13665f1e64eed5007561f8e195cd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-firewall"
RDEPENDS:${PN} += "dbus-1-python3 python(abi) python3-decorator python3-gobject python3-slip-dbus typelib(GLib) typelib(Gio) typelib(NM)"

inherit rpm
