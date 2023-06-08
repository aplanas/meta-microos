SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn57089"

RPM_NAME = "texlive-albatross-bin-2023.20230311.svn57089-89.1.aarch64.rpm"
RPM_HASH = "25f4515779165d56e055ac89b1640f66c81005ae10cf4d5405db009a0ecbfc2efbf596c807b7af7369c50ba7ccb3a21c2a92036c20316f70216ffea7f3327f48"

RPROVIDES:${PN} += "texlive-albatross-bin texlive-albatross-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-albatross"

inherit rpm
