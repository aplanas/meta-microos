SUMMARY = "Documentation for texlive-inkpaper"
DESCRIPTION = "This package includes the documentation for texlive-inkpaper"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-inkpaper-doc-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "0ab3bd3eeef28e12067cc0b879554d555f2df7a168dec539e5ff50b4295088f2ea8cde6a9e7e159be7dd4e6438dd4e8ed44d3993e1db4fc9795f905470dbc899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-inkpaper-doc:zh-cn;en) \
texlive-inkpaper-doc"
RDEPENDS:${PN} += ""

inherit rpm
