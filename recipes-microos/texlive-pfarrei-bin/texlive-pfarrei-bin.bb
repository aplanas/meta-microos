SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2023.20230311.svn29348-89.1.aarch64.rpm"
RPM_HASH = "cb5ba3b64c7349cd9a927d25fe17da8ee5d919b9f8eedb1c415f305622637f45c65c93cee9db8e1f54f03f05d549512147cc4b48acc2942d3adcfb3e1860e1fd"

RPROVIDES:${PN} += "texlive-pfarrei-bin texlive-pfarrei-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
