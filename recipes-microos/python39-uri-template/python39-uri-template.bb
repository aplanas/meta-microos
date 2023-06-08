SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-uri-template-1.2.0-2.1.noarch.rpm"
RPM_HASH = "73f11f4a431a04baf5dbe6e078d149c7d8eb71e33f758fb01a1b53604c0cfd9a5107d498658b9db8a177629446327491f6b42cac148f33628fa3770a93e85d6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uri-template) python39-uri-template python39-uri_template python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
