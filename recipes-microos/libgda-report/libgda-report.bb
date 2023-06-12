SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "76f46ff4e8726a1b19a54d3aa894a9586df9566e04f09a8a12a30ce84970872d6abf6d1a28d40f56117f553f6bdbc73ddc2e534549426de8ab999dcb3da9ae77"

RPROVIDES:${PN} += "libgda-report \
libgda-report(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
libgda-report-6_0-6_0_0"

inherit rpm
