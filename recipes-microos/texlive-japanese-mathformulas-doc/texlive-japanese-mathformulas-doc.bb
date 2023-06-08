SUMMARY = "Documentation for texlive-japanese-mathformulas"
DESCRIPTION = "This package includes the documentation for texlive-japanese-mathformulas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-doc-2023.201.1.0.2svn64678-55.1.noarch.rpm"
RPM_HASH = "eb2bc929876eaca767bff897e2440fee935e6e0e9db5023ccc0a587dd387ac2277edf181535c7bac484a72bc5173ac5fafda8493c323405affa4dce89d5c6b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-japanese-mathformulas-doc:ja) texlive-japanese-mathformulas-doc"
RDEPENDS:${PN} += ""

inherit rpm
