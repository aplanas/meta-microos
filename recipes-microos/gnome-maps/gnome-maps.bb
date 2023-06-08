SUMMARY = "Maps Application for GNOME"
DESCRIPTION = "Maps is a maps application for GNOME 3. It allows viewing street maps from \
OpenStreetMaps and satellite imagery from Mapbox. You can also get directions \
for your journeys, whether on foot, by bike, or by car."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-maps-44.1-1.1.aarch64.rpm"
RPM_HASH = "828165a3ba254462287bd9718390328119717b67d7ca01787f4f24a8253f1603cfa45bd443e0b1e823e7e7cd378a69385bbb2d473d7c2cfa2c4d2df83e88a2ad"

RPROVIDES:${PN} += "application() application(org.gnome.Maps.desktop) gnome-maps gnome-maps(aarch-64) libgnome-maps.so.0()(64bit) metainfo() metainfo(org.gnome.Maps.appdata.xml) mimehandler(application/gpx+xml) mimehandler(application/vnd.geo+json) mimehandler(application/vnd.google-earth.kml+xml) mimehandler(x-scheme-handler/geo) mimehandler(x-scheme-handler/maps) typelib(GnomeMaps)"
RDEPENDS:${PN} += "/usr/bin/gjs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libshumate-1.0.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) typelib(Adw) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GWeather) typelib(Gdk) typelib(GdkPixbuf) typelib(Geoclue) typelib(GeocodeGlib) typelib(Gio) typelib(GnomeMaps) typelib(Graphene) typelib(Gsk) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(Rest) typelib(Secret) typelib(Shumate) typelib(Soup) typelib(cairo) typelib(freetype2)"

inherit rpm
