SUMMARY = "Recommended fonts"
DESCRIPTION = "Recommended fonts, including the base 35 PostScript fonts, \
Latin Modern, TeX Gyre, and T1 and other encoding support for \
Computer Modern, in outline form."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-fontsrecommended-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "097e0bffaca78acfdb1564fff8b16e5ab93d3e210626c050796bae42baa2583bfd70c9ac2555823fc58bbe127b83cd420589c10f988cf637cf03676fe67dd2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-fontsrecommended"
RDEPENDS:${PN} += "texlive-avantgar texlive-bookman texlive-charter texlive-cm-super texlive-cmextra texlive-collection-basic texlive-courier texlive-euro texlive-euro-ce texlive-eurosym texlive-fpl texlive-helvetic texlive-lm texlive-lm-math texlive-manfnt-font texlive-marvosym texlive-mathpazo texlive-mflogo-font texlive-ncntrsbk texlive-palatino texlive-pxfonts texlive-rsfs texlive-symbol texlive-tex-gyre texlive-tex-gyre-math texlive-times texlive-tipa texlive-txfonts texlive-utopia texlive-wasy texlive-wasy-type1 texlive-wasysym texlive-zapfchan texlive-zapfding"

inherit rpm
