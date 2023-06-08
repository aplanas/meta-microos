SUMMARY = "ISO code lists and translations"
DESCRIPTION = "This package provides the ISO-639 Language code list, the ISO-3166 \
Territory code list, and ISO-3166-2 sub-territory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.13.0"

RPM_NAME = "iso-codes-devel-4.13.0-1.1.noarch.rpm"
RPM_HASH = "e1ddaff2ee1b8f25f68ad5fdc56645b1d12aa10b1e73176d35ce0fe52946110f51c42e721a937fcd4c2f5990181dc0756e4fbb2a2016f1e68ed8892b557e58e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes-devel pkgconfig(iso-codes)"
RDEPENDS:${PN} += "/usr/bin/pkg-config iso-codes"

inherit rpm
