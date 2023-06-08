SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-only"

PV = "3.30.1"

RPM_NAME = "qgis-plugin-grass-3.30.1-3.1.aarch64.rpm"
RPM_HASH = "21e7eb5e168081ec32391efa9c5602b81642e473d98ae9c244d551cb8c497fc3c3b3d812454a54bf05a0fdd49e0c1c3ffd2fbca9267d23006f9a20a2b492a40c"

RPROVIDES:${PN} += "libplugin_grass8.so()(64bit) libprovider_grass8.so()(64bit) libprovider_grassraster8.so()(64bit) libqgisgrass8.so.3.30.1()(64bit) qgis-plugin-grass qgis-plugin-grass(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig grass grass-doc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdal.so.32()(64bit) libgrass_dbmibase.8.2.so()(64bit) libgrass_dbmiclient.8.2.so()(64bit) libgrass_gis.8.2.so()(64bit) libgrass_gproj.8.2.so()(64bit) libgrass_imagery.8.2.so()(64bit) libgrass_raster.8.2.so()(64bit) libgrass_vector.8.2.so()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libqgis_app.so.3.30.1()(64bit) libqgis_core.so.3.30.1()(64bit) libqgis_gui.so.3.30.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) qgis"

inherit rpm
