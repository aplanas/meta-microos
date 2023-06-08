SUMMARY = "Development files for libsass, a library for a CSS preprocessor language"
DESCRIPTION = "This package provides development header files for libsass."
LICENSE = "MIT"

PV = "3.6.5"

RPM_NAME = "libsass-devel-3.6.5-1.8.aarch64.rpm"
RPM_HASH = "6c5e1428848dc597b011da207cd841688d26a7699cec359a95c705751939a7e0a882fbff2433a2e9932ff1b8ee006e43fc80460035a120262122518322a728c0"

RPROVIDES:${PN} += "libsass-devel libsass-devel(aarch-64) pkgconfig(libsass)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsass-3_6_5-1"

inherit rpm
