SUMMARY = "MATE module API library development files"
DESCRIPTION = "This package contains the library with common API for various MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "6dd1f1ab3e7d1377f193a32fd54554d3a58f74cee51266873d8d30a2058e22da4608373745d1183b9850a797806b4200d9ff22e63dc019f6e70611bfa8578624"

RPROVIDES:${PN} += "mate-desktop-devel mate-desktop-devel(aarch-64) pkgconfig(mate-desktop-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-desktop-2-17 pkgconfig(dconf) pkgconfig(gtk+-3.0) pkgconfig(libstartup-notification-1.0)"

inherit rpm
