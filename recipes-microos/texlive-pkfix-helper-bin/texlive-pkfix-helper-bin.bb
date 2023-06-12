SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "f5664a485753fabbb92c3a63589cf6e59f69d70126da27fd73b987223c1f5412e047c07b37dc40fd3ab9e8e8d14c263236352c7da157c708c4e13e260e96a09f"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin \
texlive-pkfix-helper-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
