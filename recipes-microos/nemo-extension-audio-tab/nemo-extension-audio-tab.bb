SUMMARY = "Audio tag information for Nemo file manager"
DESCRIPTION = "View audio tag information from the file manager's properties tab."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-audio-tab-5.2.0-3.4.noarch.rpm"
RPM_HASH = "f4dc64ebc7a1d7c5d51f6d8a1318f7da72e40305b13d9aa8c12910661d8f396ca8464dde8aaa8bc2a8a9b281b4f376077f607285f2ea9f33449d362690291ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-audio-tab python3.10dist(nemo-audio-tab) python3dist(nemo-audio-tab)"
RDEPENDS:${PN} += "/usr/bin/python3 nemo python3-mutagen python3-nemo typelib(GObject) typelib(Gio) typelib(Gtk) typelib(Nemo)"

inherit rpm
