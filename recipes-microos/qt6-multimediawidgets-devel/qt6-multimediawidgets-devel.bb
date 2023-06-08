SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimediawidgets-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "f7b927a34ea763baaf5f70a8b6edb58b437c9c83364b904e2905715cc128e4ab8986cbcc1989caa04865b4a8903d0dc562ec3fa8fb7041440c1013cfe3a0c7eb"

RPROVIDES:${PN} += "cmake(Qt6MultimediaWidgets) pkgconfig(Qt6MultimediaWidgets) qt6-multimediawidgets-devel qt6-multimediawidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Multimedia) cmake(Qt6Widgets) libQt6MultimediaWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Multimedia) pkgconfig(Qt6Widgets)"

inherit rpm
