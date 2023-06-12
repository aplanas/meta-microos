SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-latex2man-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "4f6b042097864f0104b61710374019bfe8abf9c36434a133d8f8030d23a672eb6818a0d8d9ddb36626883e8c6693f4868b21e3e3c907597e4c4b0d19c2e87dc0"

RPROVIDES:${PN} += "texlive-latex2man-bin \
texlive-latex2man-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
