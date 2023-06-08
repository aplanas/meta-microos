SUMMARY = "Simple Text Editor for Xfce"
DESCRIPTION = "Mousepad is a simple text editor for Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "mousepad-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "9e079699b2b9b93167a94ccdeabfe59f731852e146a28d513cc316848cb49e7138a99c42ea6d05c9eceef6631c6b1b4e56ee3c1d06e1d19abd23eca70b964488"

RPROVIDES:${PN} += "application() application(org.xfce.mousepad-settings.desktop) application(org.xfce.mousepad.desktop) libmousepad-plugin-gspell.so()(64bit) metainfo() metainfo(org.xfce.mousepad.appdata.xml) mimehandler(text/plain) mousepad mousepad(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgspell-1.so.2()(64bit) libgtk-3.so.0()(64bit) libmousepad.so.0()(64bit)"

inherit rpm
