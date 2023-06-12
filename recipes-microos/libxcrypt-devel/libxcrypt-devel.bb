SUMMARY = "Development files for libxcrypt"
DESCRIPTION = "The libxcrypt-devel package contains libraries and header files for \
developing applications that use libxcrypt."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.34"

RPM_NAME = "libxcrypt-devel-4.4.34-1.1.aarch64.rpm"
RPM_HASH = "8994a7e75f29022db6d28b7b1c6199f992093acd4feb50c22e64a0bce8e665f9ead358ff6848fc1c2208cc5c1e1155f320218b20f448247c2d376fa14e8c575c"

RPROVIDES:${PN} += "glibc-devel:/usr/lib64/libcrypt.so libxcrypt-devel libxcrypt-devel(aarch-64) pkgconfig(libcrypt) pkgconfig(libxcrypt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcrypt1 pkgconfig"

inherit rpm
