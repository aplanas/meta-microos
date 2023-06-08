SUMMARY = "GNOME Shell integration for Chrome Extension compatible browsers"
DESCRIPTION = "Browser extension for Google Chrome/Chromium, Firefox, Vivaldi, Opera (and other \
Browser Extension, Chrome Extension or WebExtensions capable browsers) and native \
host messaging connector that provides integration with GNOME Shell and the \
corresponding extensions repository https://extensions.gnome.org."
LICENSE = "GPL-3.0-or-later"

PV = "42.1"

RPM_NAME = "gnome-browser-connector-42.1-2.2.aarch64.rpm"
RPM_HASH = "7e60d2e237252d772146df8396f1564750871ed8478b269a597edf242ffb26ad847dab904d4800e3605445360cc5296bd645da481a254667a30db2db1803102c"

RPROVIDES:${PN} += "application() application(org.gnome.BrowserConnector.desktop) chrome-gnome-shell config(gnome-browser-connector) gnome-browser-connector gnome-browser-connector(aarch-64) mimehandler(x-scheme-handler/gnome-extensions)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi)"

inherit rpm
