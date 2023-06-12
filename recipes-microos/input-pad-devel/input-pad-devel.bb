SUMMARY = "Development tools for input-pad"
DESCRIPTION = "The input-pad-devel package contains the header files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-devel-1.0.99.20140916-5.9.aarch64.rpm"
RPM_HASH = "eacbaad62ef8ae96adee7a61ed3a9b04592124b37059ca23bde67be6ca1dcf3951a1b0596cbd998eaf100e5e522b8b72ac01e506841d3bbf7d365772658325f4"

RPROVIDES:${PN} += "input-pad-devel \
input-pad-devel(aarch-64) \
pkgconfig(input-pad)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
input-pad \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
