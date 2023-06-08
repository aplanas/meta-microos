SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-yaspin-0.18.0-1.12.noarch.rpm"
RPM_HASH = "9c559ec7b3eece492ff30e1bcce4a8c06e8cd3361cab57861699d36d09f80665609e6e9274deea3a906ea528a0a6afef1ad7a45b977dec0c27e62afea3ed126d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yaspin) python311-yaspin python3dist(yaspin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
