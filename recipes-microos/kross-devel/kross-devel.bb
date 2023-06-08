SUMMARY = "Development files for the Kross scripting bridge"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kross-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "ca2121f9a667b932a7176754f5926b7858964d793478f8dc74fd85627fbe41a8d9c1737d5d509f2fcd53a7013b81c5fc9170e2808b4a191c16ed00f3e0fed6be"

RPROVIDES:${PN} += "cmake(KF5Kross) kross-devel kross-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) cmake(KF5IconThemes) cmake(KF5KIO) cmake(KF5Parts) cmake(KF5WidgetsAddons) cmake(Qt5Core) cmake(Qt5Script) cmake(Qt5Widgets) cmake(Qt5Xml) extra-cmake-modules kross"

inherit rpm
