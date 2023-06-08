SUMMARY = "Snorenotify is a multi platform Qt based notification framework"
DESCRIPTION = "Snorenotify is a multi platform Qt based notification framework. Using a plugin system it is possible to create notifications with many different notification systems on Windows, Unix and Mac."
LICENSE = "LGPL-3.0"

PV = "0.7.0"

RPM_NAME = "snorenotify-qt5-devel-0.7.0-2.34.aarch64.rpm"
RPM_HASH = "a916c4b802ffc969bbea9322051e6cbc6a4178a25f8b623d92805d4accd5c84053f85c5585419221f226293afff75ab020feac600fd43a3bdce7f15dc79c54cb"

RPROVIDES:${PN} += "cmake(LibsnoreQt5) cmake(LibsnoreSettingsQt5) snorenotify-qt5-devel snorenotify-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "snorenotify-qt5"

inherit rpm
