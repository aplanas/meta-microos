SUMMARY = "Development files for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files.  libmsi in turn is a port of (and a subset of) Wine's \
implementation of the Windows Installer. \
 \
msitools can be used for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.101"

RPM_NAME = "msitools-devel-0.101-1.10.aarch64.rpm"
RPM_HASH = "b7a5befd8ec3fa63d430fcd5421e817ee969ab7dfda59555ca073655eb54a728ce0be247ee817721bd99bbb2e438aade813f87679016bcbcd414b5038c968c54"

RPROVIDES:${PN} += "msitools-devel \
msitools-devel(aarch-64) \
pkgconfig(libmsi-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsi0 \
msitools \
pkgconfig(gio-2.0) \
typelib-1_0-Libmsi-1_0"

inherit rpm
