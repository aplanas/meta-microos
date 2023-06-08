SUMMARY = "Create proficiency tests"
DESCRIPTION = "This package attempts to make it easy for even a LaTeX novice \
to prepare proficiency tests, especially in combination with \
the exam document class. Thus, almost all command names are \
very similar. After defining skills in the preamble or in an \
external file, they are declared using labels, and can \
optionally be set as global skills. A skills table is generated \
to summarize the evaluated competencies and to allow for \
writing down the resulting proficiency level. A user's guide \
attempts to explain all of the possibilities in a readable way, \
with many examples."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn56734"

RPM_NAME = "texlive-skills-2023.201.1.0.0svn56734-57.1.noarch.rpm"
RPM_HASH = "2f918e837765e023d646ae17e3f893a106d74ec2e50429b3516f02939d42744545a6bc90ca8c612b4f8f9e2b77da04005e42348bd34bbad48dec283a27e9e3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skills.sty) texlive-skills"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(glossaries.sty) tex(iftex.sty) tex(kvoptions.sty) tex(marginnote.sty) tex(tabularx.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
