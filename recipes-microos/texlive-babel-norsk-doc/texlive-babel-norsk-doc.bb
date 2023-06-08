SUMMARY = "Documentation for texlive-babel-norsk"
DESCRIPTION = "This package includes the documentation for texlive-babel-norsk"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0isvn65093"

RPM_NAME = "texlive-babel-norsk-doc-2023.201.2.0isvn65093-53.1.noarch.rpm"
RPM_HASH = "ee383dc5b7ca15d24eea29ffb0dad9cb24dfd6a8a493fda377354ff849c219095840f4628452d902638832d3cfb5dbb88dac84ac2108170da2c37b32ae5e5437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-norsk-doc"
RDEPENDS:${PN} += ""

inherit rpm
