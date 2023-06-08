SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12688"

RPM_NAME = "texlive-accfonts-bin-2023.20230311.svn12688-89.1.aarch64.rpm"
RPM_HASH = "021e31d47cceec6815e03039561dcdadfd7b60b814158975c8d74e1f2fb33f638371a1a73ed3e764f731c6e9821dca5452318a1f641227b06601c685f496b5e1"

RPROVIDES:${PN} += "texlive-accfonts-bin texlive-accfonts-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm
