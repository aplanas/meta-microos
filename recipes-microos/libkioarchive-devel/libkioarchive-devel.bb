SUMMARY = "Development package for libkioarchive5"
DESCRIPTION = "This is the development package for libkioarchive"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkioarchive-devel-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "f52bd8afe860582cd91c55a2aa83c39e74d110221585523b16f97fe39d95b1f64d65f0844e8361a1821cbd25e2e273cda6a2422d37ae263c1408b0c5294cc733"

RPROVIDES:${PN} += "cmake(KioArchive) libkioarchive-devel libkioarchive-devel(aarch-64)"
RDEPENDS:${PN} += "libkioarchive5"

inherit rpm
