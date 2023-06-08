SUMMARY = "Utility to process pTeX-extended TFM and VF"
DESCRIPTION = "This program provides functionality to process data files (JFM \
and VF) that form logical fonts used in (u)pTeX. The functions \
currently available include: The mutual conversion between \
Japanese virtual fonts (pairs of VF and JFM) and files in the \
'ZVP format', which is an original text format representing \
data in virtual fonts. This function can be seen as a \
counterpart to the vftovp/vptovf programs. The mutual \
conversion between VF files alone and files in the 'ZVP0 \
format', which is a subset of the ZVP format."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-2023.201.1.3.3svn60987-55.1.noarch.rpm"
RPM_HASH = "706a3834678d9b6be87ea246709172049b9b771cbb42f92e14f740cbb9417296aeb9fdfa1bcf9d360f55a5ad0732228fa8c731c137c591f9d56106bbff9e7be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jfmutil"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Encode) perl(IPC::Open3) perl(constant) perl(strict) sed texlive texlive-filesystem texlive-jfmutil-bin texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
