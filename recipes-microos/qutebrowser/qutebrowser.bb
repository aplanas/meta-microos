SUMMARY = "Keyboard-driven vim-like browser based on Qt5"
DESCRIPTION = "qutebrowser is a keyboard-focused browser with a minimal GUI. \
It's based on PyQt5 and can use either QtWebEngine or QtWebKit."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.3"

RPM_NAME = "qutebrowser-2.5.3-1.2.noarch.rpm"
RPM_HASH = "9430d520a242023630d5d463ab52fe5e487d9ef937d6d86d78b13cad402770fd9d5ef9802f2dfca79b5d6fc624245aedaf37072d60c886622b6fca1ba0c3ea80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.qutebrowser.qutebrowser.desktop) metainfo() metainfo(org.qutebrowser.qutebrowser.appdata.xml) mimehandler(application/rdf+xml) mimehandler(application/xhtml+xml) mimehandler(application/xml) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/png) mimehandler(text/html) mimehandler(text/xml) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https) mimehandler(x-scheme-handler/qute) python3.10dist(qutebrowser) python3dist(qutebrowser) qutebrowser"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/node /usr/bin/python3 libqt5-sql-sqlite python(abi) python3-Jinja2 python3-MarkupSafe python3-PyYAML python3-opengl python3-qt5 python3-qtwebengine-qt5"

inherit rpm
