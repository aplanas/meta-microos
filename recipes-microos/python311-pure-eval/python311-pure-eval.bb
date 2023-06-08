SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-pure-eval-0.2.2-2.1.noarch.rpm"
RPM_HASH = "518bf1ac5d2d07562bab0a6c5f8daa5ec5448e1ab652be09823735bd4c2ec274e26f374602a3e2929d87eb24cf62b03076cc7379bbd83cec84bbfe3256222ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pure-eval) python311-pure-eval python3dist(pure-eval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
