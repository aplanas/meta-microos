SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-3.0-only"

PV = "9.0.1"

RPM_NAME = "seafile-client-9.0.1-1.1.aarch64.rpm"
RPM_HASH = "fe4a9ac0bee9f748f0bca0738714e4b597e4074dbbddeee759cfb667470afa45af491399949b11fe4f657fe54b3ed02b3054e4708d79b93fbe15f096a937aa8e"

RPROVIDES:${PN} += "application() application(seafile.desktop) metainfo() metainfo(seafile.appdata.xml) seafile-client seafile-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libseafile.so.0()(64bit) libsearpc.so.1()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) python3-pysearpc seafile"

inherit rpm
