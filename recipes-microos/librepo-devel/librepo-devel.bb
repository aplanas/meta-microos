SUMMARY = "Header files for the Repodata downloading library"
DESCRIPTION = "This package provides the development files for librepo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "librepo-devel-1.15.1-1.4.aarch64.rpm"
RPM_HASH = "50b67cfbb0e3e7e996d86377b79c90b1e35de04eee78984b26205094327c8ac99aba8c9a603377e498085aabff2e805e26c2e2d4bb4be141d8f6721984b3b9b8"

RPROVIDES:${PN} += "librepo-devel librepo-devel(aarch-64) pkgconfig(librepo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config librepo0(aarch-64) pkgconfig(glib-2.0) pkgconfig(libcurl) pkgconfig(libxml-2.0) pkgconfig(openssl)"

inherit rpm
