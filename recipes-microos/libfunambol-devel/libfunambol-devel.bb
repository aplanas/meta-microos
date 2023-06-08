SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libfunambol."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-devel-9.0.1-16.24.aarch64.rpm"
RPM_HASH = "5f5661f2217db7934a8c3fb2fb6b5ded7befa8440c9ae0d169d99e943438473f4e7efff0236a9df5a36ed499c9a10784437ac9e6ad48bc29728ba5b236b01411"

RPROVIDES:${PN} += "libfunambol-devel libfunambol-devel(aarch-64) pkgconfig(libfunambol)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcurl-devel libfunambol-9_0_1"

inherit rpm
