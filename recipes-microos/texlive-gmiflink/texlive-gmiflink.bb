SUMMARY = "Simplify usage of \\hypertarget and \\hyperlink"
DESCRIPTION = "Three hyperref-based macros that simplify usage of \\hypertarget \
and \\hyperlink: one argument instead of the same one twice. \
Also \\gmiflink and \\gmifref which typeset plain text instead of \
generating an error or printing '??' if there is no respective \
hypertarget or label."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-2023.201.0.0.97svn15878-53.1.noarch.rpm"
RPM_HASH = "841adeaa1ab09c11524d4323998960350b743cf3160f78b5965536ac519343aa44db43c1c3f900797dd1e5f477bfd8adc534ac0940ee16a92f48b14d92ea980b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gmiflink.sty) texlive-gmiflink"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
