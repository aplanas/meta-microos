SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-dbus-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "8b06cf8eca121db41354eb7e91da3d89d75c8269c5602c81561a443a659bfcc3237e7a7bbb9910974ba4edadc5bc12741776b44c02581f15400c8b81042e579a"

RPROVIDES:${PN} += "qt6-dbus-private-devel qt6-dbus-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DBus) qt6-core-private-devel"

inherit rpm
