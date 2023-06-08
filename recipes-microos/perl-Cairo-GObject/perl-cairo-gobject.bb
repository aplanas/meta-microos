SUMMARY = "Integrate Cairo into the Glib type system"
DESCRIPTION = "Integrate Cairo into the Glib type system"
LICENSE = "LGPL-2.1-or-later"

PV = "1.005"

RPM_NAME = "perl-Cairo-GObject-1.005-1.20.aarch64.rpm"
RPM_HASH = "c0013c1f4efe1fa92c9359ac21b44524517ddd2de39c14cc953c28c8b46eea01ef1bc1dae611c2ccb720ac94552702d94d2659ecce4296421ce0b52a2c313570"

RPROVIDES:${PN} += "perl(Cairo::GObject) perl(Cairo::GObject::Install::Files) perl-Cairo-GObject perl-Cairo-GObject(aarch-64)"
RDEPENDS:${PN} += "libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Cairo) perl(ExtUtils::Depends) perl(ExtUtils::PkgConfig) perl(Glib)"

inherit rpm
