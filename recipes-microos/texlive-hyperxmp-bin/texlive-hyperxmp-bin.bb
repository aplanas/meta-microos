SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2023.20230311.svn56984-89.1.aarch64.rpm"
RPM_HASH = "90cee6b986dee80e1d6f6f99bcc6334c3b08305368ad09ce80d26e5663bea16276d7989109e414f5e9ade8cb475d9f824e0df621c2f17186e04e501280eb9712"

RPROVIDES:${PN} += "texlive-hyperxmp-bin texlive-hyperxmp-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
