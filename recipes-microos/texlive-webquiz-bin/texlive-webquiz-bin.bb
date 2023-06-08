SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50419"

RPM_NAME = "texlive-webquiz-bin-2023.20230311.svn50419-89.1.aarch64.rpm"
RPM_HASH = "dae1da2fa49f166f647bcffee60f3bd2134fbdd75a22db053708c150b5e71ea979edd04333aa02a521d1167064e9dc06780a4dbe6a8c4b74c8fc4125ae38b262"

RPROVIDES:${PN} += "texlive-webquiz-bin texlive-webquiz-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
