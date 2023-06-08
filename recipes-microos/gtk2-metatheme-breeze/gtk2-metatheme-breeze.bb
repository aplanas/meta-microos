SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 2 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.4"

RPM_NAME = "gtk2-metatheme-breeze-5.27.4-2.1.noarch.rpm"
RPM_HASH = "2d902aa82dd91a38e347d012c2097a34d4292140920240fddad957c17038b14eec8c8387da793a8a9042ade5333b466fdbae55972dde71caf4ea03bfb9468f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-breeze"
RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
