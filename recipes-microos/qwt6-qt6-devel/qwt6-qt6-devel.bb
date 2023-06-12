SUMMARY = "Include headers and Qt Designer plugin for Qwt(Qt5)"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-devel-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "50939502ab2a406a12f03614d6195aef1e3e04481c1eeddbbaefdb8976635c69734bdeeb1bb7f249c53ec0c459bbbcfff1da61e42cff346907e2a24edf8f9369"

RPROVIDES:${PN} += "pkgconfig(Qt6Qwt6) \
qwt6-qt6-devel \
qwt6-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libqwt6-qt6-6_2 \
pkgconfig(Qt6Concurrent) \
pkgconfig(Qt6OpenGL) \
pkgconfig(Qt6PrintSupport) \
pkgconfig(Qt6Svg) \
pkgconfig(Qt6Widgets) \
pkgconfig(libpng)"

inherit rpm
