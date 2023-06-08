SUMMARY = "Simple Viewer for NFO Files"
DESCRIPTION = "NFO Viewer is a simple viewer for NFO files, which are 'ASCII' art in \
the CP437 codepage. The advantages of using NFO Viewer instead of a text \
editor are preset font and encoding settings, automatic window size and \
clickable hyperlinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.29"

RPM_NAME = "nfoview-1.29-1.2.noarch.rpm"
RPM_HASH = "46fcc8e90834a784f94a0ba6af62ef1c8a62cc4be9afa89ef4541557c4e534f3857d04353b42113a3edf554dab5a00c266d8f73a56628b94f0f1a3fc37780e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(io.otsaloma.nfoview.desktop) metainfo() metainfo(io.otsaloma.nfoview.appdata.xml) mimehandler(text/x-nfo) nfoview python3.10dist(nfoview) python3dist(nfoview)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi)"

inherit rpm
