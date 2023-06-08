SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-latex2man-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "a8b6a248ea52ccdb0936653dbda2d32077a8ad4f7ccb124c2f533adaa9aff3e086ea0d509a08d6c5ba2fadec762a2bc986427760975f40b0fc92f3a95d516e60"

RPROVIDES:${PN} += "texlive-latex2man-bin texlive-latex2man-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
