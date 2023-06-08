SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python310-orange-widget-base-4.11.0-1.8.noarch.rpm"
RPM_HASH = "bab3deb01c81aa6fedf071563fa9afe95d82f44817b9d4d49a07093f91de97c7b9b18809925a87308e9cbf451481f64c5d8305ef8a82c97ffff27ab91c9824ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orange-widget-base python3.10dist(orange-widget-base) python310-orange-widget-base python3dist(orange-widget-base)"
RDEPENDS:${PN} += "python(abi) python310-AnyQt python310-matplotlib python310-orange-canvas-core python310-pyqtgraph python310-qt5 python310-qtwebengine-qt5"

inherit rpm
