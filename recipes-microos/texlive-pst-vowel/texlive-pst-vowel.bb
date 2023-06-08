SUMMARY = "Enable arrows showing diphthongs on vowel charts"
DESCRIPTION = "The package extends the vowel package (distributed as part of \
the tipa bundle) by allowing the user to draw arrows between \
vowels to show relationships such as diphthong membership. The \
package depends on use of pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-2023.201.1.0svn25228-53.1.noarch.rpm"
RPM_HASH = "69382adb1c4bfc741ff44dad5da9131887b933fdd933fef67129a16a268af59670cfdd26cd381ef2fe1e0fb3b97af47dabc0fd6f05fe52337a49e436b880542d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-vowel.sty) texlive-pst-vowel"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pst-node.sty) tex(vowel.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
