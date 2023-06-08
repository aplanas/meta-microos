SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "b385882275fd5c4d3aa0add208c69424b68a335286eb6ec44ad108c46ce02bc2752ccec5801eefc8131a53c10b13260b2b9ac92da98a463e816a25b17d9aa858"

RPROVIDES:${PN} += "libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgda-6_0-6_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsqlite3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
