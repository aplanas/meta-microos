SUMMARY = "Read data from __DATA__"
DESCRIPTION = "Data::Section::Simple is a simple module to extract data from '__DATA__' \
section of the file."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Data-Section-Simple-0.07-1.27.noarch.rpm"
RPM_HASH = "f02a8dd7ea6d719f3e557df8629770effff8493ddf7f19425a3d4a00a17684c3bd3d860a3a626aa4f3e26cc305997d753a3087c9f913bfc98504a523128068aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Section::Simple) perl-Data-Section-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
