SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid-devel-static-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "2fd43cb812b9515d4095d16f5d42d932dcd4067cdf82dc16d7db22919f9e2f93922ba68d6b0530a75a75812682ff2bcdf0928739fab0051d270906e136322bd8"

RPROVIDES:${PN} += "libblkid-devel-static libblkid-devel-static(aarch-64)"
RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
