SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python38-orange-widget-base-4.11.0-1.8.noarch.rpm"
RPM_HASH = "8e4d0ef51e21e32db8a21ce8da9cd6757c4c87072f1444805e545c30853f5bd2e685e3a041efe4c3196bdc1d0bb49b4a993420348330fdc044b6e9000ed5f4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(orange-widget-base) \
python38-orange-widget-base \
python3dist(orange-widget-base)"
RDEPENDS:${PN} += "python(abi) \
python38-AnyQt \
python38-matplotlib \
python38-orange-canvas-core \
python38-pyqtgraph \
python38-qt5 \
python38-qtwebengine-qt5"

inherit rpm
