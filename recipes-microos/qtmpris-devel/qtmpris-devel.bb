SUMMARY = "Development package for qtmpris"
DESCRIPTION = "Header files and libraries for qtmpris."
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "qtmpris-devel-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "37ff9eeb38c056ac63c07afd22018ae21c1d207fb43d49e16a73cb6be64aa773c29a48589f906d63768bc25cf713ff7cfb973e9f3b06cd01ae47365758fb4e8e"

RPROVIDES:${PN} += "pkgconfig(mpris-qt5) qtmpris-devel qtmpris-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmpris-qt5-1 pkgconfig(Qt5Core) pkgconfig(Qt5DBus)"

inherit rpm
