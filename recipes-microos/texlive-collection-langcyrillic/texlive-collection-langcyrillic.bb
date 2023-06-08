SUMMARY = "Cyrillic"
DESCRIPTION = "Support for Cyrillic scripts (Bulgarian, Russian, Serbian, \
Ukrainian), even if Latin alphabets may also be used."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-langcyrillic-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "1e0aaf7e8be85edda740f46fb668ea365f9166a402178f52f911e2a921087677de078d3cc5e44c9e925d61b39cac205fb56e6ea7df92f6551ae7c3d41bfac112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langcyrillic"
RDEPENDS:${PN} += "texlive-babel-belarusian texlive-babel-bulgarian texlive-babel-russian texlive-babel-serbian texlive-babel-serbianc texlive-babel-ukrainian texlive-churchslavonic texlive-cmcyr texlive-collection-basic texlive-collection-latex texlive-cyrillic texlive-cyrillic-bin texlive-cyrplain texlive-disser texlive-eskd texlive-eskdx texlive-gost texlive-hyphen-belarusian texlive-hyphen-bulgarian texlive-hyphen-churchslavonic texlive-hyphen-mongolian texlive-hyphen-russian texlive-hyphen-serbian texlive-hyphen-ukrainian texlive-lcyw texlive-lh texlive-lhcyr texlive-lshort-bulgarian texlive-lshort-mongol texlive-lshort-russian texlive-lshort-ukr texlive-mongolian-babel texlive-montex texlive-mpman-ru texlive-numnameru texlive-pst-eucl-translation-bg texlive-ruhyphen texlive-russ texlive-serbian-apostrophe texlive-serbian-date-lat texlive-serbian-def-cyr texlive-serbian-lig texlive-t2 texlive-texlive-ru texlive-texlive-sr texlive-ukrhyph texlive-xecyrmongolian"

inherit rpm
