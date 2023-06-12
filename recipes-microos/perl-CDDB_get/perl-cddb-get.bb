SUMMARY = "Read the CDDB entry for an audio CD in your drive"
DESCRIPTION = "This module/script gets the CDDB info for an audio cd. You need LINUX, \
SUNOS or *BSD, a cdrom drive and an active internet connection in order to \
do that."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.28"

RPM_NAME = "perl-CDDB_get-2.28-1.26.noarch.rpm"
RPM_HASH = "35fe4329360141feaf81f1b42e8a35a5514ecd66995c3450ced5daa2a9ed78c40a4c054b14dca798ad9a761833c9fe359f9305b0eb71f1ad912af52bf014f68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CDDB_cache) \
perl(CDDB_get) \
perl-CDDB_get"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
