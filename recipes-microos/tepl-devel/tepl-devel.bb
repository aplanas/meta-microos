SUMMARY = "Development files for Tepl, a text editor framework"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This subpackage contains the header files for developing \
applications that want to make use of tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "tepl-devel-6.4.0-1.4.aarch64.rpm"
RPM_HASH = "a21f94812e8fa9d3158caa317d59b86deb2fbfc472dc8d994b768c77cb090a7af41400706079829a939fc3dc4fe8d05130d992c9337a1f1819f9a531ce6f51ea"

RPROVIDES:${PN} += "pkgconfig(tepl-6) tepl-devel tepl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtepl-6-2 pkgconfig(amtk-5) pkgconfig(gio-2.0) pkgconfig(gsettings-desktop-schemas) pkgconfig(gtk+-3.0) pkgconfig(gtksourceview-4) pkgconfig(icu-i18n) pkgconfig(icu-uc) typelib-1_0-Tepl-6"

inherit rpm
