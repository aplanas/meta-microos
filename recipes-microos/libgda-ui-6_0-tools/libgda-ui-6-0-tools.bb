SUMMARY = "GNU Data Access (GDA) Library -- Graphical Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides graphical tools: \
  - gda-browser: a tool to browse databases \
  - gda-control-center: configuration tool for libgda"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-tools-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "8a97a5bb27bf35976fe61ed916ed94a40666f1e47c0a6ad373b50f08a90fa32a0f06393b75a560b897adee985319ddd62fc3f506cf25544564d3bdc0ffc164ed"

RPROVIDES:${PN} += "application() \
application(org.gnome.gda.Browser.desktop) \
libgda-ui-6_0-tools \
libgda-ui-6_0-tools(aarch-64) \
metainfo() \
metainfo(org.gnome.gda.Browser.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-ldap-6.0.so()(64bit) \
libgda-ui-6.0.so.6.0.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoocanvas-2.0.so.9()(64bit) \
libgtk-3.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
