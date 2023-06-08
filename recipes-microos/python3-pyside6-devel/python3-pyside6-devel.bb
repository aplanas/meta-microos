SUMMARY = "Development files for python3-pyside6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "python3-pyside6-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "59b69a58b1b2fffeef79b6e2a76e01d5db717b67527b6db61357b40adc095928120e8a0ffac02f910ade5a474fd3ce1cb1bddd56a1ff7009733a82bf4312b2a4"

RPROVIDES:${PN} += "cmake(PySide6) cmake(PySide6Qml) pkgconfig(pyside6) python3-pyside6-devel python3-pyside6-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(shiboken6) python3-pyside6"

inherit rpm
