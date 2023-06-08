SUMMARY = "Font STIX2 for Serbian and Macedonian"
DESCRIPTION = "The srbtiks package is the extension of the stix2-type1 package \
that enables usage of the STIX2 font in LaTeX for the Serbian \
and Macedonian languages (therefore, it is required to have the \
stix2-type1 package installed)."
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn63308"

RPM_NAME = "texlive-srbtiks-2023.201.1.0svn63308-57.1.noarch.rpm"
RPM_HASH = "529d11090cb5f0308ea58e846b3e15e627e5a10a0aa854008e95241178a35beafbbfb5a6d9f102c1dc6d2d1fece4750f4b21a0c02bdd1fafaf711a1008b3e10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(srbtiks-t1-it.enc) tex(srbtiks-t1-sc.enc) tex(srbtiks-t1.enc) tex(srbtiks.map) tex(srbtiks.sty) tex(t1srbtiks.fd) tex(t1srbtiksb-base.tfm) tex(t1srbtiksb.tfm) tex(t1srbtiksb.vf) tex(t1srbtiksc-base.tfm) tex(t1srbtiksc.tfm) tex(t1srbtiksc.vf) tex(t1srbtiksi-base.tfm) tex(t1srbtiksi.tfm) tex(t1srbtiksi.vf) tex(t1srbtiksr-base.tfm) tex(t1srbtiksr.tfm) tex(t1srbtiksr.vf) tex(t1srbtiksx-base.tfm) tex(t1srbtiksx.tfm) tex(t1srbtiksx.vf) tex(t1srbtiksy-base.tfm) tex(t1srbtiksy.tfm) tex(t1srbtiksy.vf) tex(ts1srbtiks.fd) texlive-srbtiks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(stix2.sty) tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
