SUMMARY = "Easily timeout long running operations"
DESCRIPTION = "'Time::Out' provides an easy interface to _alarm(2)_ based timeouts. Nested \
timeouts are supported."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Time-Out-0.11-3.26.noarch.rpm"
RPM_HASH = "4b452adb94a55e0c6d3676525ef830ecb39cfda0b4292fd9ed3d6ebcbfbaa4988d69af6e889b60d6507f90005057549bff46bf46a99bee967aad747c233ac75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Out) perl-Time-Out"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
