SUMMARY = "SUSE-Branded Stylesheets for DocBook"
DESCRIPTION = "These are SUSE-branded XSLT 1.0 stylesheets for DocBook 4 and 5 that are be used \
to create the HTML, PDF, and EPUB versions of SUSE documentation. These \
stylesheets are based on the original DocBook XSLT 1.0 stylesheets."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.90.0"

RPM_NAME = "suse-xsl-stylesheets-2.90.0-1.1.noarch.rpm"
RPM_HASH = "bac9608330b0031e1df2fb7681d1e72694e3bbbb7d222fe1aae10630c11791b40ce0c30536d48629af2191f4a98edd73dc7d1411ca5e415a30bc7e8ca985803c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(suse-xsl-stylesheets) suse-xsl-stylesheets"
RDEPENDS:${PN} += "/bin/sh arabic-amiri-fonts dejavu-fonts docbook-xsl-stylesheets docbook5-xsl-stylesheets docbook_4 docbook_5 ghostscript-fonts-std gnu-free-fonts google-noto-sans-jp-bold-fonts google-noto-sans-jp-regular-fonts google-noto-sans-kr-bold-fonts google-noto-sans-kr-regular-fonts google-noto-sans-sc-bold-fonts google-noto-sans-sc-regular-fonts google-noto-sans-tc-bold-fonts google-noto-sans-tc-regular-fonts google-opensans-fonts google-poppins-fonts libxslt-tools sgml-skel sil-charis-fonts"

inherit rpm
