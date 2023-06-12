SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-mdurl-0.1.2-2.1.noarch.rpm"
RPM_HASH = "cfca0ad5a6156ed70b75ca61f1c8ddca14aa3009eda0c3ce0e58f7a96d1c91631ca0b05b40b234e7afb4e84c5e3ed309fd17721b344e27bc30f9f7bbd0245841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mdurl) \
python39-mdurl \
python3dist(mdurl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
