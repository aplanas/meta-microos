SUMMARY = "URW 'Base 35' font pack for LaTeX"
DESCRIPTION = "A set of fonts for use as 'drop-in' replacements for Adobe's \
basic set, comprising: Century Schoolbook (substituting for \
Adobe's New Century Schoolbook); Dingbats (substituting for \
Adobe's Zapf Dingbats); Nimbus Mono L (substituting for Abobe's \
Courier); Nimbus Roman No9 L (substituting for Adobe's Times); \
Nimbus Sans L (substituting for Adobe's Helvetica); Standard \
Symbols L (substituting for Adobe's Symbol); URW Bookman; URW \
Chancery L Medium Italic (substituting for Adobe's Zapf \
Chancery); URW Gothic L Book (substituting for Adobe's Avant \
Garde); and URW Palladio L (substituting for Adobe's Palatino)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-times-2023.201.svn61719-52.1.noarch.rpm"
RPM_HASH = "b9c6745e3d6372da690598e5e890bdc4d1b41b75ac5fe05bb240d55d620c4d2e89f345ae686cb451116f024bfa4194f085553a923aae76344bd2184fb76b39fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(8rutm.fd) tex(omlutm.fd) tex(omsutm.fd) tex(ot1utm.fd) tex(psyro.tfm) tex(ptmb.tfm) tex(ptmb.vf) tex(ptmb7t.tfm) tex(ptmb7t.vf) tex(ptmb8c.tfm) tex(ptmb8c.vf) tex(ptmb8r.tfm) tex(ptmb8t.tfm) tex(ptmb8t.vf) tex(ptmbc.tfm) tex(ptmbc.vf) tex(ptmbc7t.tfm) tex(ptmbc7t.vf) tex(ptmbc8t.tfm) tex(ptmbc8t.vf) tex(ptmbi.tfm) tex(ptmbi.vf) tex(ptmbi7t.tfm) tex(ptmbi7t.vf) tex(ptmbi8c.tfm) tex(ptmbi8c.vf) tex(ptmbi8r.tfm) tex(ptmbi8t.tfm) tex(ptmbi8t.vf) tex(ptmbo.tfm) tex(ptmbo.vf) tex(ptmbo7t.tfm) tex(ptmbo7t.vf) tex(ptmbo8c.tfm) tex(ptmbo8c.vf) tex(ptmbo8r.tfm) tex(ptmbo8t.tfm) tex(ptmbo8t.vf) tex(ptmr.tfm) tex(ptmr.vf) tex(ptmr7t.tfm) tex(ptmr7t.vf) tex(ptmr8c.tfm) tex(ptmr8c.vf) tex(ptmr8r.tfm) tex(ptmr8rn.tfm) tex(ptmr8t.tfm) tex(ptmr8t.vf) tex(ptmrc.tfm) tex(ptmrc.vf) tex(ptmrc7t.tfm) tex(ptmrc7t.vf) tex(ptmrc8t.tfm) tex(ptmrc8t.vf) tex(ptmri.tfm) tex(ptmri.vf) tex(ptmri7t.tfm) tex(ptmri7t.vf) tex(ptmri8c.tfm) tex(ptmri8c.vf) tex(ptmri8r.tfm) tex(ptmri8t.tfm) tex(ptmri8t.vf) tex(ptmro.tfm) tex(ptmro.vf) tex(ptmro7t.tfm) tex(ptmro7t.vf) tex(ptmro8c.tfm) tex(ptmro8c.vf) tex(ptmro8r.tfm) tex(ptmro8t.tfm) tex(ptmro8t.vf) tex(ptmrr8re.tfm) tex(ptmrre.tfm) tex(ptmrre.vf) tex(ptmrrn.tfm) tex(ptmrrn.vf) tex(t1utm.fd) tex(ts1utm.fd) tex(utm.map) tex(utmb7t.tfm) tex(utmb7t.vf) tex(utmb8c.tfm) tex(utmb8c.vf) tex(utmb8r.tfm) tex(utmb8t.tfm) tex(utmb8t.vf) tex(utmbc7t.tfm) tex(utmbc7t.vf) tex(utmbc8t.tfm) tex(utmbc8t.vf) tex(utmbi7t.tfm) tex(utmbi7t.vf) tex(utmbi8c.tfm) tex(utmbi8c.vf) tex(utmbi8r.tfm) tex(utmbi8t.tfm) tex(utmbi8t.vf) tex(utmbo7t.tfm) tex(utmbo7t.vf) tex(utmbo8c.tfm) tex(utmbo8c.vf) tex(utmbo8r.tfm) tex(utmbo8t.tfm) tex(utmbo8t.vf) tex(utmr7t.tfm) tex(utmr7t.vf) tex(utmr8c.tfm) tex(utmr8c.vf) tex(utmr8r.tfm) tex(utmr8t.tfm) tex(utmr8t.vf) tex(utmrc7t.tfm) tex(utmrc7t.vf) tex(utmrc8t.tfm) tex(utmrc8t.vf) tex(utmri7t.tfm) tex(utmri7t.vf) tex(utmri8c.tfm) tex(utmri8c.vf) tex(utmri8r.tfm) tex(utmri8t.tfm) tex(utmri8t.vf) tex(utmro7t.tfm) tex(utmro7t.vf) tex(utmro8c.tfm) tex(utmro8c.vf) tex(utmro8r.tfm) tex(utmro8t.tfm) tex(utmro8t.vf) tex(zpsycmrv.tfm) tex(zpsycmrv.vf) tex(zptmcm7m.tfm) tex(zptmcm7m.vf) tex(zptmcm7t.tfm) tex(zptmcm7t.vf) tex(zptmcm7v.tfm) tex(zptmcm7v.vf) tex(zptmcm7y.tfm) tex(zptmcm7y.vf) tex(zptmcmr.tfm) tex(zptmcmr.vf) tex(zptmcmrm.tfm) tex(zptmcmrm.vf) tex(zpzccmry.tfm) tex(zpzccmry.vf) texlive-times"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cmex10.tfm) tex(cmex9.tfm) tex(cmmi10.tfm) tex(cmr10.tfm) tex(cmsy10.tfm) tex(psyr.tfm) tex(pzcmi8r.tfm) tex(rsfs10.tfm) tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-times-fonts"

inherit rpm
