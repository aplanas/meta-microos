SUMMARY = "Manual for saxon9"
DESCRIPTION = "Manual for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-manual-9.4.0.7-16.6.noarch.rpm"
RPM_HASH = "5786aef051c95b953b4e3063c0be68dc24beb04398aa418ace453ec6ef6b8ae462a5d405aad3cf8106b58cdb42238d204d7091bf707cd33f90302b18585d309f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-manual"
RDEPENDS:${PN} += ""

inherit rpm
