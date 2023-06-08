SUMMARY = "Auto-generated font map files"
DESCRIPTION = "These map files are regenerated every time a new font is added. \
There is no need to rebuild formats or update binaries because \
of such updates, hence this separate package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54495"

RPM_NAME = "texlive-updmap-map-2023.201.svn54495-56.1.noarch.rpm"
RPM_HASH = "89a1324fdf7834107bf8fc659ad23ed56bff8e3190323799bcf94605a27cfc16aa11f555d583255ff5cf92bcda7faca0d37900084ec79f520fd5d7a90962703a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(builtin35.map) tex(download35.map) tex(kanjix.map) tex(pdftex.map) tex(pdftex_dl14.map) tex(pdftex_ndl14.map) tex(ps2pk.map) tex(psfonts.map) tex(psfonts_pk.map) tex(psfonts_t1.map) texlive-updmap-map"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
