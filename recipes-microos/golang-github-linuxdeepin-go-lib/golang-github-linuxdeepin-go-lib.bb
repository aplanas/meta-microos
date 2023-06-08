SUMMARY = "Go bindings for Deepin Desktop Environment development"
DESCRIPTION = "DLib is a set of Go bindings/libraries for DDE development. \
Containing dbus (forking from guelfey), glib, gdkpixbuf, pulse and more."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.0"

RPM_NAME = "golang-github-linuxdeepin-go-lib-6.0.0-1.4.noarch.rpm"
RPM_HASH = "0a13697577b45aff25110a4f82c22c90c4a653c8aab326a1def0601e45a91ff3e662a9430649b9d2067cc398e2a918211319bd95b8a3d386751d35e82925b7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-lib"
RDEPENDS:${PN} += "golang(github.com/linuxdeepin/go-gir/gio-2.0) golang(github.com/linuxdeepin/go-gir/glib-2.0)"

inherit rpm
