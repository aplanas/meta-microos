SUMMARY = "Files for developing with mypaint-brushes"
DESCRIPTION = "This package contains a pkgconfig file which makes it easier to develop \
programs using these brush files."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "mypaint-brushes-devel-2.0.2-1.9.noarch.rpm"
RPM_HASH = "f8db0d06273380d25544451d978327bc07f0fbc18af8b74688738dbbdce49c0e8c9fd1af08d5d2a92246e85e0bb634bc661ee452f5e3dd8277379298a6047224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes-devel pkgconfig(mypaint-brushes-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mypaint-brushes"

inherit rpm
