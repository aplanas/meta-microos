SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-pygments-ansi-color-0.1.0-2.1.noarch.rpm"
RPM_HASH = "ec0f4f7b67b139e538e542ebe4eb59858356bc7f2df68a65ca72a9fe0e6a0ad2b12621b72c3d73cd450bd90250dcdb2c4e189d6ebd5a2de32650b288bcf8dae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygments-ansi-color) python311-pygments-ansi-color python3dist(pygments-ansi-color)"
RDEPENDS:${PN} += "python(abi) python311-pygments python311-setuptools"

inherit rpm
