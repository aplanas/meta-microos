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

RPM_NAME = "golang-github-linuxdeepin-go-gir-generator-2.1.0-1.8.noarch.rpm"
RPM_HASH = "a0161be38082f964a7e4599466659d476a4bbea625a58035bfd1fd1339c2666064dc3f57098d3c288949494f40ae3c732abf0ddfc5fb99636f04220a530c609c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang(github.com/linuxdeepin/go-gir/gio-2.0) golang(github.com/linuxdeepin/go-gir/glib-2.0) golang(github.com/linuxdeepin/go-gir/gobject-2.0) golang(github.com/linuxdeepin/go-gir/gudev-1.0) golang-github-linuxdeepin-go-gir-generator"
RDEPENDS:${PN} += "pkgconfig(gdk-2.0) pkgconfig(gdk-3.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gobject-introspection-1.0) pkgconfig(gudev-1.0)"

inherit rpm
