SUMMARY = "GNU Data Access (GDA) Library -- Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides command-line tools for libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-tools-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "5bcfaa036fc2e050c7cdb5c319a10033e1773f779add92914245000b77538d88a37279febfcb71dcde3dd3c28324154e518ebb2dd8f20d52fd06094f88d92d9f"

RPROVIDES:${PN} += "libgda-6_0 libgda-6_0-tools libgda-6_0-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgda-6.0.so.6.0.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsoup-2.4.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
