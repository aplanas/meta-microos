SUMMARY = "Core Akonadi Server library"
DESCRIPTION = "This package includes the core Akonadi library, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AkonadiCore5-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "fdf5c6dbd66ba1da6e62ea7f1b379875ea2805e736c30e1f0d81c9999a292199ab43999cff039b6a4d3b2dbb06fb08f251c29b81231e976da854f7e5aea68388"

RPROVIDES:${PN} += "libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiCore5 libKPim5AkonadiCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKPim5AkonadiPrivate.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
