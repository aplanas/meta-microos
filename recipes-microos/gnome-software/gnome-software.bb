SUMMARY = "GNOME Software Store"
DESCRIPTION = "AppStore like management of Applications for your GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-software-44.2-1.1.aarch64.rpm"
RPM_HASH = "4ab88091a8fe3a6b94ff95090d90c56a59340b052dc94b759aefc5065fe02641f8a513e45df919725573d523251fff77cd047a3abe493df0e07cf4c08fb697a7"

RPROVIDES:${PN} += "application() \
application(gnome-software-local-file-flatpak.desktop) \
application(gnome-software-local-file-fwupd.desktop) \
application(gnome-software-local-file-packagekit.desktop) \
application(org.gnome.Software.desktop) \
gnome-software \
gnome-software(aarch-64) \
libgnomesoftware.so.20()(64bit) \
libgs_plugin_dpkg.so()(64bit) \
libgs_plugin_dummy.so()(64bit) \
libgs_plugin_epiphany.so()(64bit) \
libgs_plugin_fedora-langpacks.so()(64bit) \
libgs_plugin_fedora-pkgdb-collections.so()(64bit) \
libgs_plugin_flatpak.so()(64bit) \
libgs_plugin_fwupd.so()(64bit) \
libgs_plugin_generic-updates.so()(64bit) \
libgs_plugin_hardcoded-blocklist.so()(64bit) \
libgs_plugin_icons.so()(64bit) \
libgs_plugin_malcontent.so()(64bit) \
libgs_plugin_modalias.so()(64bit) \
libgs_plugin_os-release.so()(64bit) \
libgs_plugin_provenance-license.so()(64bit) \
libgs_plugin_provenance.so()(64bit) \
libgs_plugin_repos.so()(64bit) \
libgs_plugin_rewrite-resource.so()(64bit) \
metainfo() \
metainfo(org.gnome.Software.Plugin.Epiphany.metainfo.xml) \
metainfo(org.gnome.Software.Plugin.Flatpak.metainfo.xml) \
metainfo(org.gnome.Software.Plugin.Fwupd.metainfo.xml) \
metainfo(org.gnome.Software.metainfo.xml) \
mimehandler(application/vnd.flatpak) \
mimehandler(application/vnd.flatpak.ref) \
mimehandler(application/vnd.flatpak.repo) \
mimehandler(application/vnd.ms-cab-compressed) \
mimehandler(application/x-app-package) \
mimehandler(application/x-deb) \
mimehandler(application/x-redhat-package-manager) \
mimehandler(application/x-rpm) \
mimehandler(x-scheme-handler/appstream)"
RDEPENDS:${PN} += "fwupd \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libappstream.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libflatpak.so.0()(64bit) \
libfwupd.so.2()(64bit) \
libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) \
libfwupd.so.2(LIBFWUPD_0.7.0)(64bit) \
libfwupd.so.2(LIBFWUPD_0.7.3)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.2)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.4)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.5)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.6)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.7)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.8)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.5)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.1)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmalcontent-0.so.0()(64bit) \
libostree-1.so.1()(64bit) \
libostree-1.so.1(LIBOSTREE_2017.10)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.8)(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libpango-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxmlb.so.2()(64bit) \
libxmlb.so.2(LIBXMLB_0.1.0)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.1)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.12)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.2)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.3)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.4)(64bit) \
libxmlb.so.2(LIBXMLB_0.1.7)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.0)(64bit) \
libxmlb.so.2(LIBXMLB_0.3.1)(64bit)"

inherit rpm
