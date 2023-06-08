SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12"

RPM_NAME = "startup-notification-devel-0.12-16.19.aarch64.rpm"
RPM_HASH = "bfeaa5fa3c93b36943d11eaa1a4f5b4fc7caa0f963c832d97e676b017a126b869a7f27defcc3d406af5fafe163ad3afea29af45395599133221d8ea15a01d4e9"

RPROVIDES:${PN} += "pkgconfig(libstartup-notification-1.0) startup-notification-devel startup-notification-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libstartup-notification-1-0"

inherit rpm
