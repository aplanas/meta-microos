SUMMARY = "DDE API golang codes"
DESCRIPTION = "The deepin-api is DDE API provides some dbus interfaces that is used for screen \
zone detecting, thumbnail generating, sound playing, etc. \
 \
This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/api prefix."
LICENSE = "GPL-3.0+"

PV = "5.5.25"

RPM_NAME = "golang-github-linuxdeepin-dde-api-5.5.25-1.4.noarch.rpm"
RPM_HASH = "e6f3244b70d8943e06e8372268e9d4c0b7489ff2dbf34f6e23586acc53c97379ad26ce23f343a898286952c2ac069294767a13106db7f3207c08cdcfb910b459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-dde-api"
RDEPENDS:${PN} += "deepin-gir-generator golang-github-linuxdeepin-go-dbus-factory golang-github-linuxdeepin-go-lib golang-github-linuxdeepin-go-x11-client pkgconfig(alsa) pkgconfig(cairo-ft) pkgconfig(gdk-pixbuf-xlib-2.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) pkgconfig(gudev-1.0) pkgconfig(libcanberra) pkgconfig(libpulse-simple) pkgconfig(librsvg-2.0) pkgconfig(polkit-qt5-1) pkgconfig(poppler-glib) pkgconfig(systemd) pkgconfig(x11) pkgconfig(xcursor) pkgconfig(xfixes) pkgconfig(xi)"

inherit rpm
