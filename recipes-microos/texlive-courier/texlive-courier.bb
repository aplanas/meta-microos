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

PV = "2023.204.svn61719"

RPM_NAME = "texlive-courier-2023.204.svn61719-54.1.noarch.rpm"
RPM_HASH = "5f54dad1bc99e0ad02ac4e9a82618fdfd33bd91573c0937b6ca8173e8ebe1100d9e9553262079021aa3ebdc495ac43a61459466e02c5f7f7d835280e8f4160b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(8rucr.fd) tex(omlucr.fd) tex(omsucr.fd) tex(ot1ucr.fd) tex(pcrb.tfm) tex(pcrb.vf) tex(pcrb7t.tfm) tex(pcrb7t.vf) tex(pcrb8c.tfm) tex(pcrb8c.vf) tex(pcrb8r.tfm) tex(pcrb8t.tfm) tex(pcrb8t.vf) tex(pcrbc.tfm) tex(pcrbc.vf) tex(pcrbc7t.tfm) tex(pcrbc7t.vf) tex(pcrbc8t.tfm) tex(pcrbc8t.vf) tex(pcrbo.tfm) tex(pcrbo.vf) tex(pcrbo7t.tfm) tex(pcrbo7t.vf) tex(pcrbo8c.tfm) tex(pcrbo8c.vf) tex(pcrbo8r.tfm) tex(pcrbo8t.tfm) tex(pcrbo8t.vf) tex(pcrr.tfm) tex(pcrr.vf) tex(pcrr7t.tfm) tex(pcrr7t.vf) tex(pcrr8c.tfm) tex(pcrr8c.vf) tex(pcrr8r.tfm) tex(pcrr8t.tfm) tex(pcrr8t.vf) tex(pcrrc.tfm) tex(pcrrc.vf) tex(pcrrc7t.tfm) tex(pcrrc7t.vf) tex(pcrrc8t.tfm) tex(pcrrc8t.vf) tex(pcrro.tfm) tex(pcrro.vf) tex(pcrro7t.tfm) tex(pcrro7t.vf) tex(pcrro8c.tfm) tex(pcrro8c.vf) tex(pcrro8r.tfm) tex(pcrro8t.tfm) tex(pcrro8t.vf) tex(t1ucr.fd) tex(ts1ucr.fd) tex(ucr.map) tex(ucrb7t.tfm) tex(ucrb7t.vf) tex(ucrb8c.tfm) tex(ucrb8c.vf) tex(ucrb8r.tfm) tex(ucrb8t.tfm) tex(ucrb8t.vf) tex(ucrbc7t.tfm) tex(ucrbc7t.vf) tex(ucrbc8t.tfm) tex(ucrbc8t.vf) tex(ucrbo7t.tfm) tex(ucrbo7t.vf) tex(ucrbo8c.tfm) tex(ucrbo8c.vf) tex(ucrbo8r.tfm) tex(ucrbo8t.tfm) tex(ucrbo8t.vf) tex(ucrr7t.tfm) tex(ucrr7t.vf) tex(ucrr8c.tfm) tex(ucrr8c.vf) tex(ucrr8r.tfm) tex(ucrr8t.tfm) tex(ucrr8t.vf) tex(ucrrc7t.tfm) tex(ucrrc7t.vf) tex(ucrrc8t.tfm) tex(ucrrc8t.vf) tex(ucrro7t.tfm) tex(ucrro7t.vf) tex(ucrro8c.tfm) tex(ucrro8c.vf) tex(ucrro8r.tfm) tex(ucrro8t.tfm) tex(ucrro8t.vf) texlive-courier"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-courier-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
