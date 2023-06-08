SUMMARY = "OpenBox window manager configuration tool"
DESCRIPTION = "Configuration tool for the OpenBox Window Manager. \
This tool is used by LXQt to configure OpenBox, since it is \
used as the default WindowManager in LXQt."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "obconf-qt-0.16.2-1.7.aarch64.rpm"
RPM_HASH = "912bb376799f3dd8709f8fd7a4e937e965b3787826bb687b5cd066a139891e04d7252d6168b15fcc689df52aa11b354b93262ccb488277a3189cdbccd3d40da6"

RPROVIDES:${PN} += "application() application(obconf-qt.desktop) obconf-qt obconf-qt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh desktop-file-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libobrender.so.32()(64bit) libobt.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) update-alternatives"

inherit rpm
