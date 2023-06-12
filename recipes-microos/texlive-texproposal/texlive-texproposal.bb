SUMMARY = "A proposal prototype for LaTeX promotion in Chinese universities"
DESCRIPTION = "This package contains the original source code and necessary \
attachment of the document 'Proposal for Offering TeX Courses \
and Relevant Resources in Chongqing University'. This proposal \
could be helpful if one is considering to suggest his/her \
university or company to use TeX (or LaTeX, or XeLaTeX) as a \
typesetting system, especially for Chinese universities and \
companies. The present proposal mainly explains the importance \
and necessity of introducing TeX, a typesetting system often \
used in academic writing, to students and teachers. This \
proposal starts from a brief introduction of TeX, then steps \
further into its fascinating application to academic writing \
and dissertation formatting. Finally, a set of possible \
implementation strategies with regard to the proper \
introduction of TeX and relevant resources to our university, \
is proposed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn43151"

RPM_NAME = "texlive-texproposal-2023.201.1.4svn43151-54.1.noarch.rpm"
RPM_HASH = "59045990900d6d21b076f16bfe4eba0c38b82bc34e9d795c0261a7ccf0d1ba17da93acdb3d295e877d22cbc7e3450bd097dc4931705dbc543224bb2c25ffa09f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texproposal"
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
