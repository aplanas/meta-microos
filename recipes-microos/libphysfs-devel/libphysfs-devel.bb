SUMMARY = "Libraries, includes and more to develop PhysicsFS applications"
DESCRIPTION = "Development package for libphysfs, a library to provide abstract access to \
various archives."
LICENSE = "(CPL-1.0 | LGPL-2.1-or-later) & Zlib"

PV = "3.2.0"

RPM_NAME = "libphysfs-devel-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "be950841c834eb1790070a3bd618b6ac764cfd0297d2291b0039dfac0499d2e97ec941992ed0c5a35d1fe0babee05f6ccc6ee257ce0db6cc19eba69c1ff8ff78"

RPROVIDES:${PN} += "cmake(PhysFS) \
libphysfs-devel \
libphysfs-devel(aarch-64) \
physfs-devel \
pkgconfig(physfs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libphysfs1"

inherit rpm
