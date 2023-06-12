SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - scrlttr2.tex: a letter, written with \
scrlttr2.cls from the KOMA-Script bundle; - dinbrief.tex: a \
letter according to the German (DIN) standards, written with \
dinbrief.cls; - kbrief.tex: a brief memo ('Kurzbrief') to \
accompany enclosures, as used in German offices, again based on \
dinbrief; - vermerk.tex: a general form for taking down notes \
on events in the office; and - diabetes.tex: a diary for the \
basis-bolus insulin therapy of diabetes mellitus, using \
scrartcl.cls from the KOMA-Script bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-templates-fenn-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "29e828ac9041ca08ef1066b690fd69d93253315b8db7d57773c61880fe1f4c2bf27ebec424cb767cd6da3e390ddbf5736dfbd7accb4011bb1db8ce4fce9e5bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-fenn"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
