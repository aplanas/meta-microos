SUMMARY = "Basic file system of TeX Live"
DESCRIPTION = "The basic file system layout for TeX Live installation."
LICENSE = "Apache-2.0 & Artistic-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LPPL-1.3c & LPPL-1.0 & MIT & BSD-3-Clause & SUSE-TeX & SUSE-Public-Domain"

PV = "2023.208"

RPM_NAME = "texlive-filesystem-2023.208-58.1.noarch.rpm"
RPM_HASH = "9bbe2e8d42069ddf1a2162fa5e69a64753e7a813524a3dffc239127ad77024f29a08b6764e55afc778f6dc63766a18315897f67ffed71302f212df1b22a568da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-filesystem) \
texlive-filesystem"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/clear \
/usr/bin/dialog \
/usr/bin/mkdir \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/perl \
/usr/bin/setpriv \
/usr/bin/stat \
/usr/bin/touch \
coreutils \
ed \
fillup \
findutils \
grep \
group(mktex) \
permissions \
python3 \
rpm_macro(_unitdir) \
rpm_macro(service_add_post) \
rpm_macro(service_add_pre) \
rpm_macro(service_del_postun) \
rpm_macro(service_del_preun) \
sed \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
user(mktex)"

inherit rpm
