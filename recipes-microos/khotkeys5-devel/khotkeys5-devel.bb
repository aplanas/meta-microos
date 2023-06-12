SUMMARY = "KDE's hotkey daemon"
DESCRIPTION = "Files to develop with KDE's hotkey daemon module."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "khotkeys5-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "176fa27c81d9611eb7fe3b8e4311874def5e36e2ab16ee5815587f32c9eebb2a825ae9884feab83290558957131294f006f2b96939768bdce14b94d99df4335e"

RPROVIDES:${PN} += "cmake(KHotKeysDBusInterface) \
khotkeys5-devel \
khotkeys5-devel(aarch-64)"
RDEPENDS:${PN} += "khotkeys5"

inherit rpm
