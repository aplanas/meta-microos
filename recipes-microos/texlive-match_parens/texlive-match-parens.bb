SUMMARY = "Find mismatches of parentheses, braces, (angle) brackets, in texts"
DESCRIPTION = "Mismatches of parentheses, braces, (angle) brackets, especially \
in TeX sources which may be rich in those, may be difficult to \
trace. This little Ruby script helps you by writing your text \
to standard output, after adding a left margin to your text, \
which will normally be almost empty, but will clearly show any \
mismatches."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.43svn36270"

RPM_NAME = "texlive-match_parens-2023.201.1.43svn36270-52.1.noarch.rpm"
RPM_HASH = "c9235be6acc5a374b9fd071ee630521e3a0bc73eb2f662849e87e98fb5080c954f5c03d046432a160c3075dde183ac9226eaa92fa6de2b17d751838201670636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-match_parens"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-match_parens-bin texlive-scripts texlive-scripts-bin"

inherit rpm
