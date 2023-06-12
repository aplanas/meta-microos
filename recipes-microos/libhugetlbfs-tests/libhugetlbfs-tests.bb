SUMMARY = "Tests for package libhugetlbfs"
DESCRIPTION = "The testsuite for libhugetlbfs. Binaries can be found in \
/usr/lib64/libhugetlbfs/tests."
LICENSE = "LGPL-2.1-or-later"

PV = "2.23.0.g6b126a4"

RPM_NAME = "libhugetlbfs-tests-2.23.0.g6b126a4-3.2.aarch64.rpm"
RPM_HASH = "3f58d5d5ebe2d65dc6b945dc0b66ab1c6d63794d42d42f16dcca3a20496eeb79b67471820bab2c547b0daa98e2a6cd7a5adb34926104d599c3f5b53f4419f2b1"

RPROVIDES:${PN} += "libhugetlbfs-tests \
libhugetlbfs-tests(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
