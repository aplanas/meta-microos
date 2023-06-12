SUMMARY = "SUSE-Branded Stylesheets for DocBook"
DESCRIPTION = "These are SUSE-branded XSLT 1.0 stylesheets for DocBook 4 and 5 that are be used \
to create the HTML, PDF, and EPUB versions of SUSE documentation. These \
stylesheets are based on the original DocBook XSLT 1.0 stylesheets."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.91.2"

RPM_NAME = "suse-xsl-stylesheets-2.91.2-1.1.noarch.rpm"
RPM_HASH = "720a5491db5c6f7fbf2d30536d43e2fc6858cc70c284e9d793712f8e27199a4fc0b3b873153adfc6f763352a766f692e49e29752ef4c08ae92cfa13ce6b8d881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(suse-xsl-stylesheets) suse-xsl-stylesheets"
RDEPENDS:${PN} += "/bin/sh arabic-amiri-fonts dejavu-fonts docbook-xsl-stylesheets docbook5-xsl-stylesheets docbook_4 docbook_5 ghostscript-fonts-std gnu-free-fonts google-noto-sans-jp-bold-fonts google-noto-sans-jp-regular-fonts google-noto-sans-kr-bold-fonts google-noto-sans-kr-regular-fonts google-noto-sans-sc-bold-fonts google-noto-sans-sc-regular-fonts google-noto-sans-tc-bold-fonts google-noto-sans-tc-regular-fonts google-opensans-fonts google-poppins-fonts libxslt-tools sgml-skel sil-charis-fonts"

inherit rpm
