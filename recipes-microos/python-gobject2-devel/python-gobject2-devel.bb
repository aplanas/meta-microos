SUMMARY = "Python bindings for GObject"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.7"

RPM_NAME = "python-gobject2-devel-2.28.7-4.6.aarch64.rpm"
RPM_HASH = "28f5adea4d88043be424ec291910de89333b8f2b4477dc96425e303ac654babe986d48adbe03ee8d8de0c8ee64ea526fd4ceb1ea9728ab71f9c25eb2c3550bf0"

RPROVIDES:${PN} += "pkgconfig(pygobject-2.0) python-gobject2-devel python-gobject2-devel(aarch-64) python-gobject2-doc python2-gobject2-devel"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/pkg-config pkgconfig(gobject-2.0) pkgconfig(libffi) python-gobject2"

inherit rpm
