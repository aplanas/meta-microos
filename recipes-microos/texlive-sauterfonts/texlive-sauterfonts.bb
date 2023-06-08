SUMMARY = "Use Sauter's fonts in LaTeX"
DESCRIPTION = "The package provides font definition files (plus a replacement \
for the package exscale) to access many of the fonts in \
Sauter's collection. These fonts are available in all point \
sizes and look nicer for such 'intermediate' document sizes as \
11pt. Also included is the package sbbm, an alternative to \
access the bbm fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sauterfonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "1b5f6274d8fb60d7575f19e524c7a7b7e15729738af76afc7ad68e6ba895f0989110c17303aa05f58df33138bf98e848744584941fef810428ab65617acb6371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sbbm.sty) tex(sexscale.sty) tex(somlcmm.fd) tex(somlcmr.fd) tex(somscmr.fd) tex(somscmsy.fd) tex(somxcmex.fd) tex(sot1cmdh.fd) tex(sot1cmfib.fd) tex(sot1cmfr.fd) tex(sot1cmr.fd) tex(sot1cmss.fd) tex(sot1cmtt.fd) tex(sot1cmvtt.fd) tex(subbm.fd) tex(subbmdh.fd) tex(subbmfib.fd) tex(subbmss.fd) tex(subbmtt.fd) tex(subbmvtt.fd) tex(subbold.fd) tex(sucmr.fd) tex(sucmss.fd) tex(sucmtt.fd) tex(sulasy.fd) tex(sumsa.fd) tex(sumsb.fd) tex(sursfs.fd) tex(sustmry.fd) tex(suwasy.fd) texlive-sauterfonts"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
