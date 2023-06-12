SUMMARY = "This package contains the development files needed by libpaper"
DESCRIPTION = "This package contains all devel files needed by the libpaper package"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libpaper-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "dd41f2b7a5748d8662b2bed7f05709a4b83a8e398b8d1a011671a3b82ecf868034d96c566ff9228a81a581a773c9b1848998895194f1911109fb08953b472fb5"

RPROVIDES:${PN} += "libpaper-devel \
libpaper-devel(aarch-64)"
RDEPENDS:${PN} += "libpaper2"

inherit rpm
