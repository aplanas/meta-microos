SUMMARY = "Tool to list orphaned RPM packages"
DESCRIPTION = "This program finds 'orphaned' packages on the system. It determines \
which packages have no other packages depending on their \
installation, and shows a list of these packages."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "rpmorphan-1.19-3.9.noarch.rpm"
RPM_HASH = "b4e62e454ae61c92cd37c6c90a749478f5c4c5c9c19a5c1c33416cfd2168e6deb6ecadbba2309b00bfa6457f7a4d3f8ecc7d1ea2ee3222f8fea833d0764cfe95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rpmorphan) perl(Tk::CListbox) perl(Tk::HButton) perl(Tk::MLColumn) perl(Tk::MListbox) rpmorphan"
RDEPENDS:${PN} += "/usr/bin/perl rpm"

inherit rpm
