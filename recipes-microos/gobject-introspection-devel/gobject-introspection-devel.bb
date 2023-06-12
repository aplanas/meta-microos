SUMMARY = "GObject Introspection Development Files"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "gobject-introspection-devel-1.76.1-2.1.aarch64.rpm"
RPM_HASH = "ea2d708e3de0735f0777b1c18d427ebdc78e614057c3835d2cbab116000c18829fc9eae0757aa2095892c952f5e1f486f3930984c29aa6c286ca87bbdc80231b"

RPROVIDES:${PN} += "gobject-introspection-devel \
gobject-introspection-devel(aarch-64) \
pkgconfig(gobject-introspection-1.0) \
pkgconfig(gobject-introspection-no-export-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gobject-introspection \
libffi-devel \
libgirepository-1_0-1 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gobject-introspection-1.0)"

inherit rpm
