SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python311-specfile-0.16.0-1.1.noarch.rpm"
RPM_HASH = "065a39f60437a502177822f1d30ee7b8fb8429016182786eb705e3d93eab31e41381a5c713c3b54a9365a6d8dd0bee97b147ffc5f4166b886a82dd107b2c3724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(specfile) python311-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python311-rpm python311-typing-extensions"

inherit rpm
