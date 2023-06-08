SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python310-rpm-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "95950d5381b60f84e94a7f86046f34198aa654c99f9a7a5f49b12d955d5b2bd1aa5e46114cb3d059c5f129c99692679b31bac3ac5117bbe0e65f253588a9f5a0"

RPROVIDES:${PN} += "python3-rpm python3.10dist(rpm) python310-rpm python310-rpm(aarch-64) python3dist(rpm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) librpm.so.9()(64bit) librpmbuild.so.9()(64bit) librpmio.so.9()(64bit) librpmsign.so.9()(64bit) python(abi) rpm"

inherit rpm
