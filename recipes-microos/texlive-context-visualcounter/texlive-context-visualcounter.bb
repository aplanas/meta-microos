SUMMARY = "Visual display of ConTeXt counters"
DESCRIPTION = "A typical document usually contains many counters: page \
numbers, section numbers, itemizations, enumerations, theorems, \
and so on. This module provides a visual display for such \
counters."
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-visualcounter-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "4a59808747c140f81888cd2fb6dfa6fa8aaab7c4332ea087d0414632d0978ac60b667a12ee782fff08805e272ac7c354d1751206024ba2c1999a47d8dcba8369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
