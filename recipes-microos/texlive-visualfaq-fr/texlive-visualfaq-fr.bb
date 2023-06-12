SUMMARY = "FAQ LaTeX visuelle francophone"
DESCRIPTION = "(French version below.) The Visual LaTeX FAQ is an innovative \
new search interface on LaTeX Frequently Asked Questions. This \
version is a French translation, offering links to the \
French-speaking LaTeX FAQ. Vous avez du mal a trouver la \
reponse a une question sur LaTeX ou meme a trouver les mots \
pour exprimer votre question? La FAQ LaTeX visuelle est une \
interface de recherche innovante qui presente plus d'une \
centaine d'exemples de mises en forme de documents frequemment \
demandees. Il suffit de cliquer sur l'hyperlien qui correspond \
a ce que vous souhaitez faire - ou ne pas faire - et la FAQ \
LaTeX visuelle enverra votre navigateur web a la page \
correspondante de la FAQ LaTeX francophone."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61420"

RPM_NAME = "texlive-visualfaq-fr-2023.201.svn61420-53.1.noarch.rpm"
RPM_HASH = "668ee529ce22b89e56e581f3e77ccb511eaf9320b47153458f0b7a5d14b3797973e63fbdfcab4aa0f07ce920d18961cb768f6d11dea69945bb161318a62c7d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq-fr"
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
