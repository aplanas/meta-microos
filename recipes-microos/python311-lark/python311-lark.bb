SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python311-lark-1.1.5-2.1.noarch.rpm"
RPM_HASH = "76361635f523e7b8527bd0b50e7fd2de88dbea57462232c8c5566a342ceb19b38cbd1f805ada67a0438be428454b91da5e13d22c8002e0e99add1a7eeb7e5a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lark) python311-lark python311-lark-parser python3dist(lark)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
