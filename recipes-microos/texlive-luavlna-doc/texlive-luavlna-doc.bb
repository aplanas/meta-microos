SUMMARY = "Documentation for texlive-luavlna"
DESCRIPTION = "This package includes the documentation for texlive-luavlna"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1jsvn64142"

RPM_NAME = "texlive-luavlna-doc-2023.201.0.0.1jsvn64142-52.1.noarch.rpm"
RPM_HASH = "a3640eeecc3b826bb0ab70d265e23a5665f5dd6fcd37d745dac35d1abaf7230a91e0f03aa60c8ccf8b04b258ff74617fe97fc28a3cb90efe0e045915186914d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luavlna-doc"
RDEPENDS:${PN} += ""

inherit rpm
