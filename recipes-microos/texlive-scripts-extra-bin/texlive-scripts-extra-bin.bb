SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53577"

RPM_NAME = "texlive-scripts-extra-bin-2023.20230311.svn53577-91.1.aarch64.rpm"
RPM_HASH = "e822797b97ed55003e26d61bcec38a20247f09b5fdbb7ab426efed53d026eb7fa78c9adcb39b7ae762895f2c4183f2bd16e657af39420c7c81d7c684aaf3e0c4"

RPROVIDES:${PN} += "texlive-pdftools-bin:/usr/bin/e2pall \
texlive-scripts-extra-bin \
texlive-scripts-extra-bin(aarch-64) \
texlive-tetex-bin:/usr/bin/allcm \
texlive-tetex-bin:/usr/bin/allneeded \
texlive-tetex-bin:/usr/bin/dvi2fax \
texlive-tetex-bin:/usr/bin/dvired \
texlive-tetex-bin:/usr/bin/kpsetool \
texlive-tetex-bin:/usr/bin/kpsewhere \
texlive-tetex-bin:/usr/bin/texconfig-dialog \
texlive-tetex-bin:/usr/bin/texconfig-sys \
texlive-tetex-bin:/usr/bin/texlinks \
texlive-texconfig-bin:/usr/bin/texconfig"
RDEPENDS:${PN} += "/bin/sh \
texlive-scripts-extra"

inherit rpm
