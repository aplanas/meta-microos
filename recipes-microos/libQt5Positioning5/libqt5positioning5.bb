SUMMARY = "Qt 5 Positioning Library"
DESCRIPTION = "The Qt Positioning API gives developers the ability to determine a \
position by using a variety of possible sources, including satellite, \
WiFi, text file, and so on. That information can then be used to, for \
example, determine a position on a map. In addition, satellite \
information can be retrieved and area-based monitoring be performed."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Positioning5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "e74a1a12d25914877c9c3c3e836a90094459cd0d53da5c5fb4032b28cb9fbcc855fe77c6a4eb2684c8caf1795c398ed0622cc41d6b1948514391418afad31507"

RPROVIDES:${PN} += "libQt5Positioning.so.5()(64bit) libQt5Positioning.so.5(Qt_5)(64bit) libQt5Positioning.so.5(Qt_5.0)(64bit) libQt5Positioning.so.5(Qt_5.1)(64bit) libQt5Positioning.so.5(Qt_5.10)(64bit) libQt5Positioning.so.5(Qt_5.11)(64bit) libQt5Positioning.so.5(Qt_5.12)(64bit) libQt5Positioning.so.5(Qt_5.13)(64bit) libQt5Positioning.so.5(Qt_5.14)(64bit) libQt5Positioning.so.5(Qt_5.15)(64bit) libQt5Positioning.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Positioning.so.5(Qt_5.2)(64bit) libQt5Positioning.so.5(Qt_5.3)(64bit) libQt5Positioning.so.5(Qt_5.4)(64bit) libQt5Positioning.so.5(Qt_5.5)(64bit) libQt5Positioning.so.5(Qt_5.6)(64bit) libQt5Positioning.so.5(Qt_5.7)(64bit) libQt5Positioning.so.5(Qt_5.8)(64bit) libQt5Positioning.so.5(Qt_5.9)(64bit) libQt5Positioning5 libQt5Positioning5(aarch-64) libqtposition_geoclue.so()(64bit) libqtposition_geoclue2.so()(64bit) libqtposition_positionpoll.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
