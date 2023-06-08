SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.37"

RPM_NAME = "glibc-i18ndata-2.37-3.1.noarch.rpm"
RPM_HASH = "22007e58e7b660f3b0bbd608bb40c938936d5237e83c29730c8c37676f326b45c62c17d78928b8cdec76096bed95468f9376fbeb3f63cd84bf0c13ba1e4e9b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"
RDEPENDS:${PN} += ""

inherit rpm
