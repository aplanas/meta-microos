SUMMARY = "Severed fonts for texlive-stmaryrd"
DESCRIPTION = "The  separated fonts package for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22027"

RPM_NAME = "texlive-stmaryrd-fonts-2023.201.svn22027-57.1.noarch.rpm"
RPM_HASH = "437dd0d61611453d395c416f03f8ac6fccbcb130326e0caccf6836a601dcf12acaa3f56fa19763941bf1148131d2fc246f551421191dd563897e8356378acc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(stmary10) font(stmary5) font(stmary6) font(stmary7) font(stmary8) font(stmary9) texlive-stmaryrd-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
