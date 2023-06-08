SUMMARY = "Basic file system of TeX Live"
DESCRIPTION = "The basic file system layout for TeX Live installation."
LICENSE = "Apache-2.0 & Artistic-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LPPL-1.3c & LPPL-1.0 & MIT & BSD-3-Clause & SUSE-TeX & SUSE-Public-Domain"

PV = "2023.201"

RPM_NAME = "texlive-filesystem-2023.201-56.1.noarch.rpm"
RPM_HASH = "774eb92302918ad27bd6707c753f8f3f94a217a95e78e271e46cdf7376b27367b5510b714c208f9621448188ef5bb9be9532a846ede1fbbeddc6da171e0781b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-filesystem) texlive-filesystem"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/clear /usr/bin/dialog /usr/bin/mkdir /usr/bin/mktemp /usr/bin/mv /usr/bin/perl /usr/bin/setpriv /usr/bin/stat /usr/bin/touch coreutils cron ed fillup findutils grep group(mktex) permissions python3 sed texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin user(mktex)"

inherit rpm
