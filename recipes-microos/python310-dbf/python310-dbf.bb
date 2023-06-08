SUMMARY = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf"
DESCRIPTION = "Pure python package for reading/writing dBase, FoxPro, and Visual FoxPro .dbf \
files (including memos) \
 \
Currently supports dBase III, Clipper, FoxPro, and Visual FoxPro tables. Text is \
returned as unicode, and codepage settings in tables are honored. Memos and Null \
fields are supported."
LICENSE = "BSD-3-Clause"

PV = "0.99.3"

RPM_NAME = "python310-dbf-0.99.3-1.3.noarch.rpm"
RPM_HASH = "9ab474e4a39fab5ce784d238bf9a2931d8c74fd2e911a0a4fef21c574c493ad83409a05ea3c572badcd0ca39b9ca7f848e665f1ec80a1a020df66b62bddabcc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbf python3.10dist(dbf) python310-dbf python3dist(dbf)"
RDEPENDS:${PN} += "python(abi) python310-aenum python310-pytz"

inherit rpm
