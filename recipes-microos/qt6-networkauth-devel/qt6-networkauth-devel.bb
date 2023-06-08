SUMMARY = "Qt 6 NetworkAuth library - Development files"
DESCRIPTION = "Development files for the Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-networkauth-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "12b9e279ad009eaea0472c312c0bee8e24a3a1b68616d0aa4d0202bb977197008049948f19059efe9773171862ff61651a9d17e372b548570f3b935d915dad33"

RPROVIDES:${PN} += "cmake(Qt6NetworkAuth) pkgconfig(Qt6NetworkAuth) qt6-networkauth-devel qt6-networkauth-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6NetworkAuth6 pkgconfig(Qt6Core) pkgconfig(Qt6Network)"

inherit rpm
