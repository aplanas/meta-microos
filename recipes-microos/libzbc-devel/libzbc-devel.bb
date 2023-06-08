SUMMARY = "Development files for libzbc, a ZBC/ZAC disk manipulation library"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks. \
 \
This subpackage contains the files needed to build against libzbc."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-devel-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "ce391da59035e5e27ba03c55b6d48a15f523051ec51c9993958409794dbcfba6edfedb0e90b8ed2c31e8f2852c4a397e06f14b09379011b5298b2c785032d840"

RPROVIDES:${PN} += "libzbc-devel libzbc-devel(aarch-64) pkgconfig(libzbc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzbc5"

inherit rpm
