SUMMARY = "Extra Gtk# bindings"
DESCRIPTION = "Gtk# Beans aims to fill the gap between the current Gtk# packages state and all the blings and desktop integration stuffs anyone would want to use. \
 \
It builds on top of Gtk# and extend it by adding new classes and extension methods."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14.1"

RPM_NAME = "gtk-sharp-beans-2.14.1-23.12.aarch64.rpm"
RPM_HASH = "ab034ff29133f38d42162f506df1d3bb45b578f800b95da09f5990a20c8aae40a2195bb4b1f700865f6523252d4b1e53c85818ae64d302206f1bb622b7f29eb6"

RPROVIDES:${PN} += "gtk-sharp-beans \
gtk-sharp-beans(aarch-64) \
mono(gtk-sharp-beans)"
RDEPENDS:${PN} += "gio-sharp \
gtk-sharp2 \
mono(gdk-sharp) \
mono(gio-sharp) \
mono(glib-sharp) \
mono(gtk-sharp) \
mono(mscorlib) \
mono-core"

inherit rpm
