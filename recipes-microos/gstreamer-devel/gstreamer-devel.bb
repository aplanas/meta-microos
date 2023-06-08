SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-devel-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "ffdda602b16386ee9aaa6741991ac25978093ccad10f4640349a1ebad6cde5ef228d4b6b7eaeba654ba83c930b9070f526be03bc84a3a9e118bec6699cfff90d"

RPROVIDES:${PN} += "gstreamer-devel gstreamer-devel(aarch-64) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(gstreamer-check-1.0) pkgconfig(gstreamer-controller-1.0) pkgconfig(gstreamer-net-1.0)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/pkg-config /usr/bin/python3 gstreamer gstreamer-utils libgstreamer-1_0-0 pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-no-export-2.0) pkgconfig(gobject-2.0) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(libdw) pkgconfig(libunwind) typelib-1_0-Gst-1_0"

inherit rpm
