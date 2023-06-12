SUMMARY = "GTK3 Spell Checker Interface Library -- Development Files"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "gtkspell3-devel-3.0.10-3.8.aarch64.rpm"
RPM_HASH = "f209fdf52dbd7034857a1aa87dc3ff338b5a3720ec50429c6a539757863037f02bc291928760384e2cc9cd0bfa14736b15947ec6e32847b4fdad8b68b5e29a72"

RPROVIDES:${PN} += "gtkspell3-devel \
gtkspell3-devel(aarch-64) \
pkgconfig(gtkspell3-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkspell3-3-0 \
pkgconfig(enchant-2) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-GtkSpell-3_0"

inherit rpm
