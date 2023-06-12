SUMMARY = "Development files for ofono, a mobile telephony framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API. \
 \
This subpackage contains the header files for developing \
applications that want to make use of ofono."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-devel-1.34-1.7.aarch64.rpm"
RPM_HASH = "10427867f179ce277b24c2a8d9db601285e6900d449f6ef1e6c08c2ea6865f9f4da4a2110679b92d1729425dc709a8f2a725405978b0cd78b4d1557f6c1de0df"

RPROVIDES:${PN} += "ofono-devel \
ofono-devel(aarch-64) \
pkgconfig(ofono)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ofono \
pkgconfig(dbus-1) \
pkgconfig(glib-2.0)"

inherit rpm
