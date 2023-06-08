SUMMARY = "KDE's window decorations library (development package)"
DESCRIPTION = "Development files belonging to kdecoration, \
plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libkdecoration2-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "dd489fc08ddf3105622a826e37232a96036e077647f062b418d563b8eb06201df73532e5b8716664cc0bf8eb29adb3d911937ac99a716720a49bb358204e343a"

RPROVIDES:${PN} += "cmake(KDecoration2) libkdecoration2-devel libkdecoration2-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Gui) libkdecorations2-5 libkdecorations2private10"

inherit rpm
