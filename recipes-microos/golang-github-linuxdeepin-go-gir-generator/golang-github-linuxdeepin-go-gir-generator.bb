SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Go-gir-generator imeplement static golang bindings for GObject. \
 \
There has many go bindings for GObject/Gtk libraries, but almost all of them \
are written by hand. It's bored and error-prone when the binding C libaray \
changed. \
 \
Go-gir-geneator's object is like python-gobject's that binding the newest \
library without need change binding codes. \
 \
Currently it only official support Gobject-2.0, Glib-2.0, Gio-2.0. Because \
generate the gdkpixbuf binding hasn't completed, so Gdk/Gtk were also in blocking."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "golang-github-linuxdeepin-go-gir-generator-2.1.0-1.10.noarch.rpm"
RPM_HASH = "445896ab2df17738407188eab768c517ec71d6b5ef67afda68d6f5bfc1671209e55768525236b5c09b32505c224eacca79fba8768508b4ffd1955bf4f3a0612b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang(github.com/linuxdeepin/go-gir/gio-2.0) \
golang(github.com/linuxdeepin/go-gir/glib-2.0) \
golang(github.com/linuxdeepin/go-gir/gobject-2.0) \
golang(github.com/linuxdeepin/go-gir/gudev-1.0) \
golang-github-linuxdeepin-go-gir-generator"
RDEPENDS:${PN} += "pkgconfig(gdk-2.0) \
pkgconfig(gdk-3.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gobject-introspection-1.0) \
pkgconfig(gudev-1.0)"

inherit rpm
