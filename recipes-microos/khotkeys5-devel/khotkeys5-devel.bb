SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "Files to develop with KDE's hotkey daemon module."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "khotkeys5-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "a8caa1a53e646d26f326c6bcbee973f01583995df5a39528324e85c6fd34a3f240faca10be0b2d69eb3f39b7d592df71553d63c6c2607d2e37a14bed8ee55c73"

RPROVIDES:${PN} += "cmake(KHotKeysDBusInterface) khotkeys5-devel khotkeys5-devel(aarch-64)"
RDEPENDS:${PN} += "khotkeys5"

inherit rpm
