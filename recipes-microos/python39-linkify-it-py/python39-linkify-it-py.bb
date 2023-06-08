SUMMARY = "Links recognition library with FULL unicode support"
DESCRIPTION = "Links recognition library with FULL unicode support. Focused on high quality link patterns detection in plain text. \
 \
Why it's awesome: \
* Full unicode support, with astral characters! \
* International domains support. \
* Allows rules extension & custom normalizers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-linkify-it-py-2.0.0-2.1.noarch.rpm"
RPM_HASH = "661e52ca36bf819a763d53c4b63037b8b1c03e8e4cd2f669371afa43c157a29cbeb4c3c4be63af6d420f4806b685dab77e90b4f2429723f929d1b282ed8436e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(linkify-it-py) python39-linkify-it-py python3dist(linkify-it-py)"
RDEPENDS:${PN} += "python(abi) python39-uc-micro-py"

inherit rpm
