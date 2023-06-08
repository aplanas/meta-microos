SUMMARY = "Kluwer publication support"
DESCRIPTION = "Most likely long obsolete, unfortunately."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-kluwer-2023.201.svn54074-55.1.noarch.rpm"
RPM_HASH = "b0580c1dcf72f11f49ba6b3dc1bbfe55802f1196e173d08eaeeeb57562fa70f99b3d9a61a991de6a0ff238eca5ce2e9235972ec2ab76b15e324e2b8f4cab81ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(klu10.clo) tex(klu105.clo) tex(klu11.clo) tex(klu12.clo) tex(klu9.clo) tex(klucite.sty) tex(kluedit.sty) tex(klufloa.sty) tex(klulist.sty) tex(klumac.sty) tex(klumath.sty) tex(klumono.sty) tex(klunote.sty) tex(kluopen.sty) tex(klups.sty) tex(kluref.sty) tex(klusec.sty) tex(klut10.clo) tex(klut11.clo) tex(klut12.clo) tex(klut9.clo) tex(klutab.sty) tex(kluwer.cls) texlive-kluwer"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(doc.sty) tex(fontenc.sty) tex(mathptm.sty) tex(textcomp.sty) tex(wasysym.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
