SUMMARY = "GTK+ 3 support for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only & CC-BY-SA-4.0"

PV = "20.10.6.1"

RPM_NAME = "gtk3-metatheme-yaru-20.10.6.1-1.6.noarch.rpm"
RPM_HASH = "ce1c0fe9c190078326e477bdbced9935ea33c707419b92fd808a0abaa6a2326c89e4939d33f6613ab67bc80ecb4cc0211144788031ec4393178039cdc19f4f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yaru"
RDEPENDS:${PN} += "gtk3 metatheme-yaru-common"

inherit rpm
