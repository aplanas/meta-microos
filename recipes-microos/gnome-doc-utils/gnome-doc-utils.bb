SUMMARY = "A Collection of Documentation Utilities for GNOME"
DESCRIPTION = "The gnome-doc-utils package is a collection of documentation \
utilities for the GNOME project. It contains utilities for building \
documentation and auxiliary files in a source tree. It also contains \
the DocBook XSLT stylesheets that were once distributed with Yelp."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "gnome-doc-utils-0.20.10-21.5.noarch.rpm"
RPM_HASH = "72dbd93b7ae7334dc0e2007b978b52c5177d1bf0fc1051d7adc1aa12771e016b5291162f6fae43ed2b8c150e386f5897a1baccafad5e5b084654a7a7b7e7149c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-doc-utils"
RDEPENDS:${PN} += "/bin/bash \
libxslt \
python3-libxml2"

inherit rpm
