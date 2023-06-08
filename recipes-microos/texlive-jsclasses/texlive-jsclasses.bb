SUMMARY = "Classes tailored for use with Japanese"
DESCRIPTION = "Classes jsarticle and jsbook are provided, together with \
packages okumacro and okuverb. These classes are designed to \
work under ASCII Corporation's Japanese TeX system ptex."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66093"

RPM_NAME = "texlive-jsclasses-2023.201.svn66093-55.1.noarch.rpm"
RPM_HASH = "8ae2ab76a2ee9186dda90144bfc2cd11bf433fcf2d5234802190b1b88ac834a99f355e07703f892299c61f7e28167f018dae4af46702f5b56244cf856b6c4b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jsarticle.cls) tex(jsbook.cls) tex(jslogo.sty) tex(jspf.cls) tex(jsreport.cls) tex(jsverb.sty) tex(kiyou.cls) tex(minijs.sty) tex(okumacro.sty) tex(okuverb.sty) texlive-jsclasses"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ts1enc.def) tex(type1cm.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
