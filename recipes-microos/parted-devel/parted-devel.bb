SUMMARY = "Parted Include Files and Libraries necessary for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-devel-3.5-4.4.aarch64.rpm"
RPM_HASH = "8cb6b3cc18b5ca34aa99432eb47ca5d5d6df16372dfaacb2db3995cdd2a814f4910aa3859b8b6dbc3c66c0df49a7fa3cd4e8b90845abafa300cdffd5bb2e9a95"

RPROVIDES:${PN} += "parted-devel parted-devel(aarch-64) pkgconfig(libparted) pkgconfig(libparted-fs-resize)"
RDEPENDS:${PN} += "/usr/bin/pkg-config device-mapper-devel libparted-fs-resize0 libparted2"

inherit rpm
