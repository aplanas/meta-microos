SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python310-email-reply-parser-0.5.12-1.8.noarch.rpm"
RPM_HASH = "93d38f3985a3980cda2f2efa217c5dba00a7db1b573d663b669bb94c31d6d516ff3e679c1c31e43adc22c7c412ec49e31ce73ed7033b22b6441242297e874a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-reply-parser python3.10dist(email-reply-parser) python310-email-reply-parser python3dist(email-reply-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
