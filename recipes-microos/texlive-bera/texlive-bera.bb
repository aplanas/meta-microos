SUMMARY = "Bera fonts"
DESCRIPTION = "The package contains the Bera Type 1 fonts, and a zip archive \
containing files to use the fonts with LaTeX. Bera is a set of \
three font families: Bera Serif (a slab-serif Roman), Bera Sans \
(a Frutiger descendant), and Bera Mono (monospaced/typewriter). \
Support for use in LaTeX is also provided. The Bera family is a \
repackaging, for use with TeX, of the Bitstream Vera family."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-bera-2023.201.svn20031-53.1.noarch.rpm"
RPM_HASH = "6cb3185908a3649a7e2578780aaeff8cf1bf9f8d2ef6b56a1eafc5bbc3a61bc52bcf6feda30ff996bb252c17bcde2375e809870551500d719fdcecb958bf378f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bera.map) tex(bera.sty) tex(beramono.sty) tex(berasans.sty) tex(beraserif.sty) tex(fveb8a.tfm) tex(fveb8c.tfm) tex(fveb8c.vf) tex(fveb8r.tfm) tex(fveb8t.tfm) tex(fveb8t.vf) tex(fvebo8c.tfm) tex(fvebo8c.vf) tex(fvebo8r.tfm) tex(fvebo8t.tfm) tex(fvebo8t.vf) tex(fver8a.tfm) tex(fver8c.tfm) tex(fver8c.vf) tex(fver8r.tfm) tex(fver8t.tfm) tex(fver8t.vf) tex(fvero8c.tfm) tex(fvero8c.vf) tex(fvero8r.tfm) tex(fvero8t.tfm) tex(fvero8t.vf) tex(fvmb8a.tfm) tex(fvmb8c.tfm) tex(fvmb8c.vf) tex(fvmb8r.tfm) tex(fvmb8t.tfm) tex(fvmb8t.vf) tex(fvmbo8a.tfm) tex(fvmbo8c.tfm) tex(fvmbo8c.vf) tex(fvmbo8r.tfm) tex(fvmbo8t.tfm) tex(fvmbo8t.vf) tex(fvmr8a.tfm) tex(fvmr8c.tfm) tex(fvmr8c.vf) tex(fvmr8r.tfm) tex(fvmr8t.tfm) tex(fvmr8t.vf) tex(fvmro8a.tfm) tex(fvmro8c.tfm) tex(fvmro8c.vf) tex(fvmro8r.tfm) tex(fvmro8t.tfm) tex(fvmro8t.vf) tex(fvsb8a.tfm) tex(fvsb8c.tfm) tex(fvsb8c.vf) tex(fvsb8r.tfm) tex(fvsb8t.tfm) tex(fvsb8t.vf) tex(fvsbo8a.tfm) tex(fvsbo8c.tfm) tex(fvsbo8c.vf) tex(fvsbo8r.tfm) tex(fvsbo8t.tfm) tex(fvsbo8t.vf) tex(fvsr8a.tfm) tex(fvsr8c.tfm) tex(fvsr8c.vf) tex(fvsr8r.tfm) tex(fvsr8t.tfm) tex(fvsr8t.vf) tex(fvsro8a.tfm) tex(fvsro8c.tfm) tex(fvsro8c.vf) tex(fvsro8r.tfm) tex(fvsro8t.tfm) tex(fvsro8t.vf) tex(t1fve.fd) tex(t1fvm.fd) tex(t1fvs.fd) tex(ts1fve.fd) tex(ts1fvm.fd) tex(ts1fvs.fd) texlive-bera"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontenc.sty) tex(keyval.sty) tex(textcomp.sty) tex(updmap.cfg) texlive texlive-bera-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
