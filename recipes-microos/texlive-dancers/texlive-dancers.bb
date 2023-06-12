SUMMARY = "Font for Conan Doyle's 'The Dancing Men'"
DESCRIPTION = "The (Sherlock Holmes) book contains a code which uses dancing \
men as glyphs. The alphabet as given is not complete, lacking \
f, j, k, q, u, w, x and z, so those letters in the font are not \
due to Conan Doyle. The code required word endings to be marked \
by the dancing man representing the last letter to be holding a \
flag: these are coded as A-Z. \
thaTiStOsaYsentenceSiNthEcodElooKlikEthiS. In some cases, the \
man has no arms, making it impossible for him to hold a flag. \
In these cases, he is wearing a flag on his hat in the \
'character'. The font is distributed as Metafont source; it \
works poorly in modern environments, and could do with expert \
attention (if you are interested, please contact the CTAN team \
for details)."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn13293"

RPM_NAME = "texlive-dancers-2023.204.svn13293-54.1.noarch.rpm"
RPM_HASH = "891b9d32fb53cf28c3dfe5955308a4cebd31decf3e918d3074088e66ae92742fe0493781b6805162ba31e099eba0c14fc31f41b263f78862500707ccf042e71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dancers.tfm) \
texlive-dancers"
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
