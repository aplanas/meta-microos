SUMMARY = "Interface to Gd Graphics Library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.76"

RPM_NAME = "perl-GD-2.76-1.9.aarch64.rpm"
RPM_HASH = "00bd9f10bd23fea9bad51b88fcd0e265169cd305ed7b83ad7921e4bbd8022f315795b967761f12ad9461480b62375b12e677463bc9bb0e995b474e64a7617233"

RPROVIDES:${PN} += "perl(GD) perl(GD::Group) perl(GD::Image) perl(GD::Polygon) perl(GD::Polyline) perl(GD::Simple) perl-GD perl-GD(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl gd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgd.so.3()(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
