SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13364"

RPM_NAME = "texlive-pkfix-bin-2023.20230311.svn13364-89.1.aarch64.rpm"
RPM_HASH = "5b6eb757a3fbf3baec7b8e4593181a6ec0e976f7d7844b420fc2c696cc3234f620a8011badfbc3bf956b6a06a2bd3a3fdc70636a18fde3c9b4d3356acb707aa0"

RPROVIDES:${PN} += "texlive-pkfix-bin texlive-pkfix-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
