SUMMARY = "Chinese font metrics for upTeX"
DESCRIPTION = "The package contains some Chinese font metrics (JFM, VF, etc) \
for upTeX engine, together with a simple DVIPDFMx font mapping \
of Fandol fonts for DVIPDFMx."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-2023.201.1.0svn40728-52.1.noarch.rpm"
RPM_HASH = "4e8e000d3e1f278f4d95677338e034bdcad2f181d1ab72e8b19e9b6899125275838dda130762f8cedad67ba7ba439fa5c2bf0759d69bc9e92416a21081b1af11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(upmono-h.tfm) tex(upmono-v.tfm) tex(upsans-h.tfm) tex(upsans-v.tfm) tex(upsansb-h.tfm) tex(upsansb-v.tfm) tex(upserif-h.tfm) tex(upserif-v.tfm) tex(upserifb-h.tfm) tex(upserifb-v.tfm) tex(upserifit-h.tfm) tex(upserifit-v.tfm) tex(upzhmono-h.tfm) tex(upzhmono-h.vf) tex(upzhmono-v.tfm) tex(upzhmono-v.vf) tex(upzhsans-h.tfm) tex(upzhsans-h.vf) tex(upzhsans-v.tfm) tex(upzhsans-v.vf) tex(upzhsansb-h.tfm) tex(upzhsansb-h.vf) tex(upzhsansb-v.tfm) tex(upzhsansb-v.vf) tex(upzhserif-h.tfm) tex(upzhserif-h.vf) tex(upzhserif-v.tfm) tex(upzhserif-v.vf) tex(upzhserifb-h.tfm) tex(upzhserifb-h.vf) tex(upzhserifb-v.tfm) tex(upzhserifb-v.vf) tex(upzhserifit-h.tfm) tex(upzhserifit-h.vf) tex(upzhserifit-v.tfm) tex(upzhserifit-v.vf) texlive-zhmetrics-uptex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
