SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python311-rpm-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "9417ac4b2d111c399156a1c523e8b99175fe3117a152e7f2d0df9b2deb051c398fb3a49dde0ac5b400f81b7169ba5024d114abc817966bf0ca5087cd71470e21"

RPROVIDES:${PN} += "python3.11dist(rpm) python311-rpm python311-rpm(aarch-64) python3dist(rpm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) librpm.so.9()(64bit) librpmbuild.so.9()(64bit) librpmio.so.9()(64bit) librpmsign.so.9()(64bit) python(abi) rpm"

inherit rpm
