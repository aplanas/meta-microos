SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-mdurl-0.1.2-2.1.noarch.rpm"
RPM_HASH = "71c4db8a2de237c5e35fa2259a541ea3057a15430d16ec44d90481432b56a0f3ca95f1886e4189e7d0e3c22678fed42c01eeca70aac5a8cf5f6a533daafa2ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mdurl) \
python311-mdurl \
python3dist(mdurl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
