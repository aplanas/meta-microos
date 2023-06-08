SUMMARY = "GTK3 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "libgtkspell3-3-0-3.0.10-3.8.aarch64.rpm"
RPM_HASH = "eb75019168b30a4fe58ed7d08415e35d964eebe735e8e4ad19ac6cebd24b3cf356bf4dd6db0bea78dd0a4b0df61f9617c98390d5b39b22194c201e3ad9d2b74b"

RPROVIDES:${PN} += "gtkspell3 libgtkspell3-3-0 libgtkspell3-3-0(aarch-64) libgtkspell3-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
