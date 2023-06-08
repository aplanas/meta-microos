SUMMARY = "C++ bindings development files for libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the C++ bindings development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig++-devel-1.7.3-1.8.aarch64.rpm"
RPM_HASH = "05222dc44c3088aac89131dec18fc794903a155ed17e5ca4868812ec4613259b46ad58ddd9fb0c73ca816eb504bf60ab9067d180b9ca33d92a253944141cdc6d"

RPROVIDES:${PN} += "libconfig++-devel libconfig++-devel(aarch-64) pkgconfig(libconfig++)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libconfig++11 libconfig-devel"

inherit rpm
