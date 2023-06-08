SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5ModemManagerQt-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "dbd45e20f3cb7ea9c599bf0207b0d027b97ab6478e65e4285857e9895ac005257eb0c0451a3c1c8e427106c769a87262176c4b52ed8c325a5e87eb1592224d68"

RPROVIDES:${PN} += "cmake(KF5ModemManagerQt) libKF5ModemManagerQt-devel libKF5ModemManagerQt-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5DBus) libKF5ModemManagerQt6 pkgconfig(ModemManager)"

inherit rpm
