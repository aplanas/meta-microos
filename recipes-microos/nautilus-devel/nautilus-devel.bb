SUMMARY = "File Manager for the GNOME Desktop -- Development Files"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains development files for nautilus."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "nautilus-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "851172c6f6adc6685c858cf1f7093c158ad29a5b3cc6923b776132f1684ce168d4aa57fa82fb8592700f234c9fb54efc7283158b9154ecb67071b1969cfcc306"

RPROVIDES:${PN} += "nautilus-devel nautilus-devel(aarch-64) pkgconfig(libnautilus-extension-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnautilus-extension4 nautilus pkgconfig(gio-2.0) pkgconfig(glib-2.0) typelib-1_0-Nautilus-4_0"

inherit rpm
