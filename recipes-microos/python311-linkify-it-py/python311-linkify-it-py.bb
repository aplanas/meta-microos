SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-linkify-it-py-2.0.0-2.1.noarch.rpm"
RPM_HASH = "3b1be84f867fc1de9acf81dd20ed76615b80a350ff52ccbabd2ab5dc22b9154e1cef943890581db4718f213b23d8d2a06e4ddf7998c63b25766eb165e127b1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(linkify-it-py) python311-linkify-it-py python3dist(linkify-it-py)"
RDEPENDS:${PN} += "python(abi) python311-uc-micro-py"

inherit rpm
