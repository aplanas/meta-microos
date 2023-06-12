SUMMARY = "Spreadsheet-like interface to SQLite databases"
DESCRIPTION = "SQLite Database Browser is a visual tool for creating, designing and \
editing database files compatible with SQLite. It provides a \
spreadsheet-like interface, without the need to learn SQL commands. \
Controls and guided dialogs are available for users to: \
 \
	* Create and compact database files \
	* Create, define, modify and delete tables \
	* Create, define and delete indexes \
	* Browse, edit, add and delete records \
	* Search records \
	* Import and export records as text \
	* Import and export tables from/to CSV files \
	* Import and export databases from/to SQL dump files \
	* Issue SQL queries and inspect the results \
	* Examine a log of all SQL commands issued by the application"
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.12.2"

RPM_NAME = "sqlitebrowser-3.12.2-2.11.aarch64.rpm"
RPM_HASH = "2a3087e432784b88d2cd662601e156d0dc1ecd551304f6ece65ceda413b1ad29dd701acceff7343cb8a48d9a989a322c1e016978c620a3d0226d13d8eac64caf"

RPROVIDES:${PN} += "application() application(sqlitebrowser.desktop) metainfo() metainfo(sqlitebrowser.desktop.appdata.xml) sqlitebrowser sqlitebrowser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libqscintilla2_qt5.so.15()(64bit) libsqlcipher-3.41.2.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
