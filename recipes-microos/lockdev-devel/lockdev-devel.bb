SUMMARY = "A library for locking devices"
DESCRIPTION = "The lockdev library provides a reliable way to put an exclusive lock \
on devices using both FSSTND and SVr4 methods. The lockdev-devel \
package contains the development headers."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "lockdev-devel-1.0.3_git201003141408-31.20.aarch64.rpm"
RPM_HASH = "e81e59cf5a518d17868841485a1b390ab71e16803ac844e5afc77a1fc8b7a64e06e06c8419cedabb4f48874af202b90d2acb9edf7b6b5a8b2bc4d1bd2c3ccd85"

RPROVIDES:${PN} += "lockdev-devel \
lockdev-devel(aarch-64) \
pkgconfig(lockdev)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
lockdev"

inherit rpm
