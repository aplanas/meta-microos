SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53577"

RPM_NAME = "texlive-scripts-extra-bin-2023.20230311.svn53577-89.1.aarch64.rpm"
RPM_HASH = "24da2f5f2b2d1469c7272e852286b806a6b83a868e6a276aaada87694d7171e7690a2c8cca76bbf20e57db9505b7f01baf9cbf7d1cde2a9c8f6fdaf2124edc7b"

RPROVIDES:${PN} += "texlive-pdftools-bin:/usr/bin/e2pall texlive-scripts-extra-bin texlive-scripts-extra-bin(aarch-64) texlive-tetex-bin:/usr/bin/allcm texlive-tetex-bin:/usr/bin/allneeded texlive-tetex-bin:/usr/bin/dvi2fax texlive-tetex-bin:/usr/bin/dvired texlive-tetex-bin:/usr/bin/kpsetool texlive-tetex-bin:/usr/bin/kpsewhere texlive-tetex-bin:/usr/bin/texconfig-dialog texlive-tetex-bin:/usr/bin/texconfig-sys texlive-tetex-bin:/usr/bin/texlinks texlive-texconfig-bin:/usr/bin/texconfig"
RDEPENDS:${PN} += "/bin/sh texlive-scripts-extra"

inherit rpm
