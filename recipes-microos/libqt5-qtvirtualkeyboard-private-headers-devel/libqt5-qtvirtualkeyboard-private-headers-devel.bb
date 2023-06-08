SUMMARY = "Non-ABI stable API for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides private headers of libqt5-qtvirtualkeyboard that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-private-headers-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a45b4da1d1e6927114ef12289360916087eb61565bcef98f0a440744b1953ae227b2114b84056d6d69b320911c98481f039f3a71be613c5fa95aec4d5a6f57e9"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-private-headers-devel libqt5-qtvirtualkeyboard-private-headers-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libqt5-qtvirtualkeyboard-devel"

inherit rpm
