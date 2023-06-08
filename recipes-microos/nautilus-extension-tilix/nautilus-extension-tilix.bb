SUMMARY = "Nautilus Extension to Open Tilix in Folders"
DESCRIPTION = "This is a Nautilus extension that allows you to open tilix in \
arbitrary folders."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.5"

RPM_NAME = "nautilus-extension-tilix-1.9.5-3.1.noarch.rpm"
RPM_HASH = "f35c0977bd7620acf0b5449b27a59203f58bd5ebc2d94d3e6ab6cbb36deba0a4eb60782380aef4bfcef247156d76beeab112abf23d88710b151e48aa925c87e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-tilix"
RDEPENDS:${PN} += "python3-nautilus typelib(GObject) typelib(Gio) typelib(Gtk) typelib(Nautilus)"

inherit rpm
