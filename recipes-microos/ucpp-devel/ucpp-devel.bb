SUMMARY = "Files for Developing with ucpp"
DESCRIPTION = "Includes and definitions for developing with the ucpp library."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-devel-1.3.5-2.18.aarch64.rpm"
RPM_HASH = "086f5bd346f70f5443255acda2b0b1438808f114fd008304c07b4475b568a00ffe51034e61cbb4be31b8c2c1b83401df2338a7dc1217f9d59a22da6cdf36dcf4"

RPROVIDES:${PN} += "pkgconfig(libucpp) ucpp-devel ucpp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libucpp13"

inherit rpm
