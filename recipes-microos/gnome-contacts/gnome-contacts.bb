SUMMARY = "Contacts Manager for GNOME"
DESCRIPTION = "The integraded address book for GNOME. \
 \
Among its features are: \
 \
 * Search for and view contacts; \
 * Edit contact details and make new contacts; \
 * Integration with online address books; \
 * Automatic linking of contacts from different online sources."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-contacts-44.0-1.1.aarch64.rpm"
RPM_HASH = "44c99f9f653b0d549d2ae11b4b295033de37d3c7b4907f86f60ab657f2c1cf21763faed88dd3cf2d123158eb25eeec9ad0c510cac631971604cfa21b32a864e9"

RPROVIDES:${PN} += "application() application(org.gnome.Contacts.desktop) gnome-contacts gnome-contacts(aarch-64) metainfo() metainfo(org.gnome.Contacts.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libebook-contacts-1.2.so.4()(64bit) libedataserver-1.2.so.27()(64bit) libfolks-eds.so.26()(64bit) libfolks.so.26()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libpango-1.0.so.0()(64bit) libportal.so.1()(64bit) libqrencode.so.4()(64bit)"

inherit rpm
