SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-profile-2.37-3.1.aarch64.rpm"
RPM_HASH = "acaf032685c74149d5fd8606f3b5f1a5557df60d3e36ebfdf081732a2cfff1073aeeb6910917c06b34e0b30e26ad7baf63918abf2d5f3c8649bafe97f301b555"

RPROVIDES:${PN} += "glibc-profile glibc-profile(aarch-64)"
RDEPENDS:${PN} += "glibc"

inherit rpm
