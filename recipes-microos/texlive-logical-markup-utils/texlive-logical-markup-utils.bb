SUMMARY = "Packages for language-dependent inline quotes and dashes"
DESCRIPTION = "The bundle contains two packages: quoted, for inserting \
quotation marks; and onedash, for inserting dashes. Each \
package takes a language name as an option; accepted language \
options are american, british, german and polish."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-logical-markup-utils-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "df9908c08b77304e3fcbe5cc42a65bc970489b34bcfbe038f992783944b4091464a5321b55c80d078b93b5e8a7db6a463248de174f778b94381d5ea824b7d253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(onedash.sty) \
tex(quoted.sty) \
texlive-logical-markup-utils"
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
