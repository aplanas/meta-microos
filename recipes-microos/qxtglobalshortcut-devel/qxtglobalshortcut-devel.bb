SUMMARY = "Development files for qxtglobalshortcut"
DESCRIPTION = "This package provides header files and documentation for developing \
applications using qxtglobalshortcut library."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "qxtglobalshortcut-devel-0.0.1+git1533120914.688715b-1.23.aarch64.rpm"
RPM_HASH = "87ed362292b47e49d3e89f2dc39519877f8b4f91de87b77c551d74b7cd1e0bdbb96e293d9fa01f8af0d66f715db020a3d39a665add2a585565cdca759d713e3e"

RPROVIDES:${PN} += "cmake(qxtglobalshortcut) pkgconfig(qxtglobalshortcut) qxtglobalshortcut-devel qxtglobalshortcut-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libqxtglobalshortcut0 pkgconfig(Qt5Widgets)"

inherit rpm
