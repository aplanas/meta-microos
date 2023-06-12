SUMMARY = "Development files for the KDE CD drive library"
DESCRIPTION = "This package contains the development headers for libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkcompactdisc-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a951ddcae1906ae48c0e8933826109686cb5d0f9b3587d08e68f46cf99a154860bfe30f4efd85b0b8e35d7ee341daf0ee46e686c9229b0044f751a3a7c97f9ea"

RPROVIDES:${PN} += "cmake(KF5CompactDisc) libkcompactdisc-devel libkcompactdisc-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5CompactDisc5"

inherit rpm
