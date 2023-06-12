SUMMARY = "GTK2 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "gtkspell-doc-2.0.16-23.9.aarch64.rpm"
RPM_HASH = "b79969b187d7dac76a6c41711ed53e5aa0ea7c87533dc583a3947b7d60e5f6814c2961d8a524787ecc0cee58d492447560e57a827f7347b3f2a2ee74fffe40bd"

RPROVIDES:${PN} += "gtkspell-doc \
gtkspell-doc(aarch-64)"
RDEPENDS:${PN} += "libgtkspell0"

inherit rpm
