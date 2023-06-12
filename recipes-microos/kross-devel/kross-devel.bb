SUMMARY = "Development files for the Kross scripting bridge"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kross-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "50029272c27e32c9b467807243e63aa041188ae5ef6c0c7ac8240f5f4d92a77f625ec840d2d46be49caded29d56d50006b88c6d51e28cc6d6332e7103584c98e"

RPROVIDES:${PN} += "cmake(KF5Kross) \
kross-devel \
kross-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5I18n) \
cmake(KF5IconThemes) \
cmake(KF5KIO) \
cmake(KF5Parts) \
cmake(KF5WidgetsAddons) \
cmake(Qt5Core) \
cmake(Qt5Script) \
cmake(Qt5Widgets) \
cmake(Qt5Xml) \
extra-cmake-modules \
kross"

inherit rpm
