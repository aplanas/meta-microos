SUMMARY = "Development files for libverto-glib1"
DESCRIPTION = "The libverto-glib-devel package contains libraries and header files \
for developing applications that use libverto-glib."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-glib-devel-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "8c066549594040d45692e948b633b7aec51a9a8b44c61a634dc018a7980915e05efdf753622e57890a687477d6301230c8e7066b9655a4576e9b9c0120a034ce"

RPROVIDES:${PN} += "libverto-glib-devel libverto-glib-devel(aarch-64) pkgconfig(libverto-glib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libverto-devel(aarch-64) libverto-glib1(aarch-64) pkgconfig(libverto)"

inherit rpm
