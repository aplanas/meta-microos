SUMMARY = "The BibTeX (Latex) bibliography manager by KDE"
DESCRIPTION = "KBibTeX is a BibTeX editor by KDE to edit bibliographies used with \
LaTeX. Features include comfortable input masks, starting web queries \
(e. g. Google or PubMed) and exporting to PDF, PostScript, RTF and \
XML/HTML. As KBibTeX is using KDE's KParts technology, KBibTeX can be \
embedded into Kile or Konqueror."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-0.9.3.2-1.4.aarch64.rpm"
RPM_HASH = "236fcc4a023bc0303c21618caf6ef5a0c2b80e3d1255e57e86cf8062f0484bc3ea8ef9f5e3ad67c76e4a2c8261c9cc4fc8bf7dda0bc8eb49d94c765480a69b11"

RPROVIDES:${PN} += "application() application(org.kde.kbibtex.desktop) kbibtex kbibtex(aarch-64) libkbibtexconfig.so.0()(64bit) libkbibtexdata.so.0()(64bit) libkbibtexgui.so.0()(64bit) libkbibtexio.so.0()(64bit) libkbibtexnetworking.so.0()(64bit) libkbibtexproc.so.0()(64bit) metainfo() metainfo(org.kde.kbibtex.appdata.xml) mimehandler(application/x-research-info-systems) mimehandler(text/x-bibtex)"
RDEPENDS:${PN} += "/sbin/ldconfig desktop-file-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) libpoppler-qt5.so.1()(64bit) libqoauth.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) shared-mime-info"

inherit rpm
